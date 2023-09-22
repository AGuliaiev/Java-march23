package Lesson2.HW2_2;

import Lesson2.HW2_2.PC;

public class Laptop extends PC {
    private int weight;

    public Laptop() {
    }

    public Laptop(int CPUs, int RAM, double monitor, int weight) {
        super(CPUs, RAM, monitor);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
