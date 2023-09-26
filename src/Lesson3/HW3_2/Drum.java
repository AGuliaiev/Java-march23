package Lesson3.HW3_2;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Грає барабан "  + "розмір: " + size);
    }
}
