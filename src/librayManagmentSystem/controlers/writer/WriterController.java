package librayManagmentSystem.controlers.writer;

import librayManagmentSystem.model.Writer;

import java.util.List;

public interface WriterController {

     boolean isWriterExists();

     List<Writer> getWriterList();

     Writer getWriterById(int id);

     boolean saveWriter(Writer writer);


}
