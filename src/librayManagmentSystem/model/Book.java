package librayManagmentSystem.model;

public class Book {
    private String bookName;
    private Writer writer;


    
    public Book(String bookName,Writer writer){
        this.bookName=bookName;
        this.writer=writer;
    }

    public String getBookName() {
        return bookName;
    }

    public Writer getWriter() {
        return writer;
    }
}
