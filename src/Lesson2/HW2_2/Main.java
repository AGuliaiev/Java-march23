package Lesson2.HW2_2;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 16, 15, 2);
        System.out.println(laptop);
        Ultrabook ultrabook = new Ultrabook(12, 32, 21, 1, 1);
        System.out.println(ultrabook);
        Workstation workstation = new Workstation(32, 128, 25, 50, Video.NVIDIA);
        System.out.println(workstation);
    }
}
