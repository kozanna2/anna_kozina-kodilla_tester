import java.sql.SQLOutput;

public class Book {
    private String author;
    private String title;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    static void of(String author, String title) {
        Book of = new Book();
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.of("JKR", "HP");
    }
}
