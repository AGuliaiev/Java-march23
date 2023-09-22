package Lesson2.HW2_2;

public enum Video {
    AMD("AMD"),
    NVIDIA("NVIDIA");
    private final String brand;

    Video(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Video{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }
}
