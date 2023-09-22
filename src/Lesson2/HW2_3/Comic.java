package Lesson2.HW2_3;

public class Comic extends Book {
    private boolean illustrator;

    public Comic(String author) {
        super(author);
    }

    public Comic(String material, int length, String author, boolean illustrator) {
        super(material, length, author);
        this.illustrator = illustrator;
    }

    public boolean isIllustrator() {
        return illustrator;
    }

    public Comic setIllustrator(boolean illustrator) {
        this.illustrator = illustrator;
        return this;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "illustrator=" + illustrator +
                "} " + super.toString();
    }
}
