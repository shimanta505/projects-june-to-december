package librayManagmentSystem.controlers.writer;

import librayManagmentSystem.model.Writer;
import librayManagmentSystem.repository.writer.WriterRepository;
import librayManagmentSystem.repository.writer.WriterRepositoryImpl;

import java.util.List;

public class WriterControllerImpl implements WriterController {
    WriterRepository writerRepository = new WriterRepositoryImpl();
    @Override
    public boolean isWriterExists() {
        return writerRepository.isWriterExists();
    }

    @Override
    public List<Writer> getWriterList() {
        return writerRepository.getWriterList();
    }

    @Override
    public Writer getWriterById(int id) {
        return writerRepository.getWriterById(id);
    }

    @Override
    public boolean saveWriter(Writer writer) {
        return writerRepository.saveWriter(writer);
    }
}
