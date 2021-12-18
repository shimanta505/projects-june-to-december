package librayManagmentSystem.controlers.book;

import librayManagmentSystem.model.Book;
import java.util.List;

public interface BookController {

     boolean saveBook(Book book);

    List<Book> getBooks();

}
