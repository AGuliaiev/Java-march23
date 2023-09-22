package Lesson2.HW2_3;

public class Book extends Papyrus{
    private String author;

    public Book(String author) {
        this.author = author;
    }

    public Book(String material, int length, String author) {
        super(material, length);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }
}
