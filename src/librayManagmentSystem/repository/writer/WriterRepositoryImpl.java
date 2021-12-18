package librayManagmentSystem.repository.writer;

import librayManagmentSystem.model.Writer;
import librayManagmentSystem.service.writer.WriterService;
import librayManagmentSystem.service.writer.WriterServiceImpl;

import java.util.List;

public class WriterRepositoryImpl implements WriterRepository {

    private WriterService writerService;

    public WriterRepositoryImpl(){
        writerService = new WriterServiceImpl();
    }

    @Override
    public boolean isWriterExists() {
        return writerService.isWriterExists();
    }

    @Override
    public boolean saveWriter(Writer writer) {
        return writerService.saveWriter(writer);
    }

    @Override
    public List<Writer> getWriterList() {
        return writerService.getWriterList();
    }

    @Override
    public Writer getWriterById(int id) {
        return writerService.getWriterById(id);
    }
}