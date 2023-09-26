package Lesson3.HW3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(14);
        Trumpet trumpet = new Trumpet(10);
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
