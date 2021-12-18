package librayManagmentSystem.view;

import librayManagmentSystem.controlers.book.BookController;
import librayManagmentSystem.controlers.book.BookControllerImpl;
import librayManagmentSystem.controlers.member.MemberController;
import librayManagmentSystem.controlers.member.MemberControllerImpl;
import librayManagmentSystem.controlers.writer.WriterController;
import librayManagmentSystem.controlers.writer.WriterControllerImpl;
import librayManagmentSystem.dataSource.Library;
import librayManagmentSystem.model.Book;
import librayManagmentSystem.model.BookEntry;
import librayManagmentSystem.model.Member;
import librayManagmentSystem.model.Writer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class MainView {

    static Scanner input = new Scanner(System.in);

//    static MainController mainController = new MainController();
    static BookController bookController = new BookControllerImpl();
    static WriterController writerController = new WriterControllerImpl();
    static MemberController memberController = new MemberControllerImpl();

    public static void main(String[] args) {


        System.out.println("do you want to enter the system then press y or n");

        String userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("y")) {
            showMenu();
        } else {
            System.out.println("you decided not to enter");
        }
        input.close();
    }

    private static void showMenu() {
        System.out.println(".......please check the menu......");
        System.out.println("enter bs to sava book");
        System.out.println("enter ms to save a member");
        System.out.println("Enter wd to withdraw a book");
        System.out.println("enter bl to see list of books");
        System.out.println("enter Wn to see writers name");
//        System.out.println("enter ws to see books from writer");
        System.out.println("enter ml to see list of members");
        System.out.println("enter wl to see withdraw list ");
        System.out.println("enter n to exit...");
        String command = input.nextLine();

        if (command.equalsIgnoreCase("bs")) {
            saveBook();
        } else if (command.equalsIgnoreCase("ms")) {
            addMember();
        }else if(command.equalsIgnoreCase("wd")){
            bookWithdraw();
        }else if (command.equalsIgnoreCase("bl")) {
            showBookList(true);
        } else if (command.equalsIgnoreCase("wn")) {
            showWritersName();
        } else if (command.equalsIgnoreCase("ws")) {
            showBooksFromWriter();
        } else if (command.equalsIgnoreCase("ml")) {
            showMembersName();
        } else if (command.equalsIgnoreCase("wl")) {
            showWithDrawnList();
        }
        else if(command.equalsIgnoreCase("n")){
            System.out.println("you are successfully logged out");
        }
        input.close();
    }

    public static void saveBook() {

        Writer writer = null;

        if (writerController.isWriterExists()) {
            List<Writer> writers = writerController.getWriterList();
            boolean existsId = false;
//                for (Writer contain : writers){
//
//                }

            for (Writer w : writers) {
                System.out.println("name " + w.getName() + " ID: " + w.getId());
            }
            System.out.println("enter id of the writer to select from the list ");
            int writerId = input.nextInt();
            input.nextLine();
            for (Writer contain : writers) {
                if (writerId == contain.getId()) {
                    writer = writerController.getWriterById(writerId);
                    existsId = true;
                    break;
                }
            }
            if (!existsId) {
//                    writer = createWriter();
                System.out.println("no writer exists from this id.if you want to add another id please Enter add ");
                System.out.println("if you want to select writer from the list then Enter li or if you want to go on main menu then Enter E");
                String addId = input.nextLine();
                if (addId.equalsIgnoreCase("add")) {
                    writer = createWriter();
                } else if (addId.equalsIgnoreCase("li")) {
                    saveBook();
                } else if (addId.equalsIgnoreCase("e")) {
                    showMenu();
                } else {
                    saveBook();
                }
            }


//                writer = mainController.getWriterById(writerId);
        } else {
            writer = createWriter();
        }
        if (writer == null) {
            System.out.println("this id already exists");
            saveBook();
        }

        System.out.println("enter book title");

        String bookTitle = input.nextLine();

        Book book = new Book(bookTitle, null);

        boolean isSaved = bookController.saveBook(book);

        if (isSaved) {
            System.out.println("book saved");

        } else {
            System.out.println("couldn't save book");
        }
        showMenu();

    }

    public static void showBookList(boolean shouldShowMenu) {

        List<Book> books = bookController.getBooks();
//        List<Writer> writers = writerController.getWriterList();
        if (books.size()==0){
            System.out.println("no books are available");
            showMenu();
        }

        for (Book singleBook : books) {
            System.out.println(singleBook.getBookName());
        }
        if (shouldShowMenu) {
            showMenu();
        }
    }

    public static Writer createWriter() {
        List<Writer> writers = writerController.getWriterList();
        System.out.println("enter writer id and name ");

        int writerId = input.nextInt();
        input.nextLine();
        String name = input.nextLine();

        Writer writer = new Writer(name, writerId);
        for (Writer id : writers) {
            if (id.getId() == writerId) {
                return null;
            }
        }
        if (writerController.saveWriter(writer)) {
            return writer;
        } else {
            return null;
        }
    }

    public static void showWritersName() {
        List<Writer> writers = writerController.getWriterList();

        if (writerController.isWriterExists()) {
            for (Writer writerNames : writers) {
                System.out.println(writerNames.getName());
            }
            showMenu();
        } else {
            System.out.println("you didn't saved any books ");
            showMenu();
        }
    }

    public static void showBooksFromWriter(){
        List<Writer> writers = writerController.getWriterList();
        List<Book> books = bookController.getBooks();
        System.out.println("enter your writer name");
        String name = input.nextLine();

        for(Book b : books){
            if (b.getWriter().toString().equalsIgnoreCase(name)){
                System.out.println(b.getBookName());
            }
        }
        showMenu();
    }
    public static void returnDate(){
        List<Member> members = memberController.getMemberList();
        System.out.println("enter member registration number ");
        int reg =input.nextInt();input.nextLine();
        System.out.println("enter your return date.....");
        String date = input.nextLine();
        boolean available = false;
        for (Member m : members){
            if (m.getRegistrationNumber()==reg){
                System.out.println("you are a member ");
                System.out.println("your due date is   ");
                System.out.println("your return date is    "+date);available=true;break;
            }
        }
        if (!available){
            System.out.println("you are not a member please be a member first ");
        }
        showMenu();
    }

    public static void addMember() {
        Member member = null;

        if (memberController.isMemberExists()) {

            saveMember();

        } else {
            saveMember();
        }
        showMenu();
    }

    public static void saveMember() {
        List<Member> members = memberController.getMemberList();
        boolean exists = false;
        System.out.println("enter member name to add ");
        String name = input.nextLine();
        System.out.println("enter member registration number ");
        int regNumber = input.nextInt();
        input.nextLine();
        for (Member contain : members) {
            if (regNumber == contain.getRegistrationNumber()) {
                System.out.println("this registration number already exists");

                exists = true;
                break;
            }
        }
        Member member = new Member(name, regNumber);
        if (!exists) {
            boolean isSaved = memberController.saveMember(member);

            if (isSaved) {
                System.out.println("member is created");
            } else {
                System.out.println("couldn't save member");
            }
        }
        showMenu();
    }

    public static void showMembersName() {
        List<Member> members = memberController.getMemberList();

        if (memberController.isMemberExists()) {

            for (Member names : members) {
                System.out.println("name : " + names.getName() + " registration number : " + names.getRegistrationNumber());
            }

        } else {
            System.out.println("you didn't add any member ");
        }
        showMenu();
    }

    public static void bookWithdraw(){
        System.out.println("please enter your registration number ");
        int regNumber = input.nextInt();input.nextLine();

        Member member = Library.getMembersByReg(regNumber);

        if (member == null){
            System.out.println("sorry we couldn't find any member with that provided registration number ");bookWithdraw();
        }
        System.out.println("enter book name");
        System.out.println("current list of books...");
        showBookList(false);

        String bookName = input.nextLine();
        Book book = Library.getBookByName(bookName);

        System.out.println("enter due date...");

        String dueDate = input.nextLine();
        String withdrawDate = withdrawDate();
        BookEntry bookEntry = new BookEntry(withdrawDate,dueDate,book,member);
        Library.addBookEntry(bookEntry);
        if(Library.map.containsKey(member)) {
            List<Book> list = Library.map.get(member);
            list.add(book);
            Library.map.put(member, list);
        } else {
            List<Book> bookList = new ArrayList<>();
            bookList.add(book);
            Library.map.put(member, bookList);
        }
        showWithDrawnList();
    }

    public static void showWithDrawnList(){
        for (Map.Entry<Member,List<Book>> entry : Library.map.entrySet()){
            System.out.println("member name  "+entry.getKey().getName());
            System.out.println("books taken by him ");

            for (Book book : entry.getValue()){
                System.out.println("book name "+book.getBookName());
            }
        }
        showMenu();
    }

    public static String withdrawDate(){
        DateFormat simple = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date(System.currentTimeMillis());
        return simple.format(date);
    }


}
