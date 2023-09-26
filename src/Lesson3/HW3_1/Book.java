package Lesson3.HW3_1;

public class Book implements Printable {
    public Book(int pages, String author) {
        this.pages = pages;
        this.author = author;
    }

    public Book() {
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private int pages;
    private String author;

    @Override
    public void print() {
        System.out.println("Author " + author + " " + "pages: " + pages);

    }
}
