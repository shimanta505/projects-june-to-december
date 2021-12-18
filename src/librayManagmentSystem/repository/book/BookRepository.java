package librayManagmentSystem.repository.book;

import librayManagmentSystem.model.Book;

import java.util.List;

public interface BookRepository {
    boolean saveBook(Book book);

    List<Book> getBooks();
}
