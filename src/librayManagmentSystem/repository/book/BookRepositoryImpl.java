package librayManagmentSystem.repository.book;

import librayManagmentSystem.model.Book;
import librayManagmentSystem.service.BookService;

import java.util.List;


public class BookRepositoryImpl implements BookRepository {
    @Override
    public boolean saveBook(Book book) {
        BookService bookService = new BookService();
        return bookService.saveBook(book);
    }

    @Override
    public List<Book> getBooks() {
        BookService bookService = new BookService();
        return bookService.getBooks();
    }


//    public boolean saveBook(Book book){
//        BookService bookService = new BookService();
//        return bookService.saveBook(book);
//    }
//    public List<Book> getBooks(){
//        BookService bookService = new BookService();
//        return bookService.getBooks();
//    }

}
