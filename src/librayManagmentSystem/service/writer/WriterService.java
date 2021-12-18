package librayManagmentSystem.service.writer;

import librayManagmentSystem.model.Writer;

import java.util.List;

public interface WriterService {
     boolean isWriterExists();

     boolean saveWriter(Writer writer);

     List<Writer> getWriterList();

     Writer getWriterById(int id);
}
