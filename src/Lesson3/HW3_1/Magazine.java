package Lesson3.HW3_1;

public class Magazine implements Printable{
    private String publisher;
    private String title;

    public Magazine(String publisher, String title) {
        this.publisher = publisher;
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title + " publisher " + publisher);
    }
}
