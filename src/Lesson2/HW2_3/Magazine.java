package Lesson2.HW2_3;

public class Magazine extends Book {
    private String publisher;

    public Magazine(String material, int length, String author, String publisher) {
        super(material, length, author);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public Magazine setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "publisher='" + publisher + '\'' +
                "} " + super.toString();
    }
}
