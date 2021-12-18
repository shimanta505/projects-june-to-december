package librayManagmentSystem.service.writer;

import librayManagmentSystem.dataSource.Library;
import librayManagmentSystem.model.Writer;

import java.util.List;

public class WriterServiceImpl implements WriterService{
    @Override
    public boolean isWriterExists() {
        return Library.anyWriterFromTheList();
    }

    @Override
    public boolean saveWriter(Writer writer) {
        return Library.saveWriter(writer);
    }

    @Override
    public List<Writer> getWriterList() {
        return Library.getWriters();
    }

    @Override
    public Writer getWriterById(int id) {
        return Library.getWritersById(id);
    }

}
