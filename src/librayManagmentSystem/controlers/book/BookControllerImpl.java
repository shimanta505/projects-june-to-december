package librayManagmentSystem.controlers.book;

import librayManagmentSystem.model.Book;
import librayManagmentSystem.repository.book.BookRepository;
import librayManagmentSystem.repository.book.BookRepositoryImpl;

import java.util.List;

public class BookControllerImpl implements BookController {
    static BookRepository bookRepository = new BookRepositoryImpl();

    @Override
    public boolean saveBook(Book book) {
        return bookRepository.saveBook(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }
}
