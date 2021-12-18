package librayManagmentSystem.dataSource;

import librayManagmentSystem.model.Book;
import librayManagmentSystem.model.BookEntry;
import librayManagmentSystem.model.Member;
import librayManagmentSystem.model.Writer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private static List<Book> books = new ArrayList<>();
    private static List<Writer> writers = new ArrayList<>();
    private static List<Member> members = new ArrayList<>();
    private static List<BookEntry> bookEntries = new ArrayList<>();

    public static Map<Member,List<Book>> map = new HashMap<>();

    public static boolean saveBook(Book book){
        books.add(book);
        return true;
    }
    public static Book getBookByName(String bookName){
        for (Book book :books){
            if (book.getBookName().equalsIgnoreCase(bookName)){
                return book;
            }
        }
        return null;
    }
    public static List<Book> getBooks(){
        return books;
    }
    public static boolean saveWriter(Writer writer){
       return writers.add(writer);
    }
    public static boolean anyWriterFromTheList(){
        return writers.size() != 0;
    }

    public static List<Writer> getWriters(){
        return writers;
    }

    public static Writer getWritersById(int id){
        for (Writer writer : writers){
            if (writer.getId()==id){
                return writer;
            }
        }
        return null;
    }

    public static boolean addMember(Member member){
        members.add(member);
        return true;
    }
    public static List<Member> getMembers(){
        return members;
    }
    public static boolean isMemberExists(){
        return members.size() != 0;
    }
    public static Member getMembersByReg(int reg){
        for (Member member: members){
            if (member.getRegistrationNumber()==reg){
                return member;
            }
        }
        return null;
    }
    public static boolean addBookEntry(BookEntry bookEntry){
        bookEntries.add(bookEntry);
        return true;
    }

}
