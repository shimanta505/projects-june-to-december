package librayManagmentSystem.repository.writer;

import librayManagmentSystem.model.Writer;

import java.util.List;

public interface WriterRepository {
    boolean isWriterExists();

    boolean saveWriter(Writer writer);

    List<Writer> getWriterList();

    Writer getWriterById(int id);

}