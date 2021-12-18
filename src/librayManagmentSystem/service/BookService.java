package librayManagmentSystem.service;

import librayManagmentSystem.dataSource.Library;
import librayManagmentSystem.model.Book;

import java.util.List;

public class BookService {
    public boolean saveBook(Book book){
        return Library.saveBook(book);
    }
    public List<Book> getBooks(){
        return Library.getBooks();
    }

}
