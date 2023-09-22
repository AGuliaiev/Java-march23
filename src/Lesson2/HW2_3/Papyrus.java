package Lesson2.HW2_3;

public class Papyrus {
    private String material;
    private int length;

    public Papyrus() {
    }

    public Papyrus(String material, int length) {
        this.material = material;
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public Papyrus setMaterial(String material) {
        this.material = material;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Papyrus setLength(int length) {
        this.length = length;
        return this;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "material='" + material + '\'' +
                ", length=" + length +
                '}';
    }
}
