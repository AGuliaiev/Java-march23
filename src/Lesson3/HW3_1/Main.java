package Lesson3.HW3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(250, "Dumas");
        Magazine magazine = new Magazine("Kiev House", "City");
        ArrayList<Printable> print = new ArrayList<>();
        print.add(book);
        print.add(magazine);

        for (Printable printable : print) {
            printable.print();
        }
    }

}
