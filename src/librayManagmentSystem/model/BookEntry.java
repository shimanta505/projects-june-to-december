package librayManagmentSystem.model;

public class BookEntry {
    private String withdrawDate;
    private String dueDate;
    private Book book;
    private Member member;

    public BookEntry(String withdrawDate, String dueDate, Book book, Member member) {
        this.withdrawDate = withdrawDate;
        this.dueDate = dueDate;
        this.book = book;
        this.member = member;
    }

    public String getWithdrawDate() {
        return withdrawDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }
}
