package librayManagmentSystem.controlers;

import librayManagmentSystem.model.Book;
import librayManagmentSystem.model.Member;
import librayManagmentSystem.model.Writer;
import librayManagmentSystem.repository.book.BookRepositoryImpl;
import librayManagmentSystem.repository.book.BookRepository;
import librayManagmentSystem.repository.member.MemberRepository;
import librayManagmentSystem.repository.member.MemberRepositoryImpl;
import librayManagmentSystem.repository.writer.WriterRepository;
import librayManagmentSystem.repository.writer.WriterRepositoryImpl;


import java.util.List;

public class MainController {
   static WriterRepository writerRepository = new WriterRepositoryImpl();
   static BookRepository bookRepository = new BookRepositoryImpl();
   static MemberRepository memberRepository = new MemberRepositoryImpl();
    public boolean saveBook(Book book){
        return bookRepository.saveBook(book);
    }

    public List<Book> getBooks(){
        return bookRepository.getBooks();
    }

//    public boolean saveWriter(Writer writer){
//        return writerRepository.saveWriter(writer);
//    }

//    public List<Writer> getWriters(){
//        return writerRepository.getWriters();
//    }

    public boolean isWriterExists(){
        return writerRepository.isWriterExists();
    }

    public List<Writer> getWriterList(){
        return writerRepository.getWriterList();
    }

    public Writer getWriterById(int id) {
        return writerRepository.getWriterById(id);
    }

    public boolean saveWriter(Writer writer) {
        return writerRepository.saveWriter(writer);
    }

    public boolean saveMember(Member member){
        return memberRepository.saveMember(member);
    }
    public List<Member> getMemberList(){
        return memberRepository.getMemberList();
    }
    public boolean isMemberExists(){
      return   memberRepository.isMemberExists();
    }
    public Member getMembersByReg(int reg){
        return memberRepository.getMembersByReg(reg);
    }
}
