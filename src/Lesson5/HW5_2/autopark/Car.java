package Lesson5.HW5_2.autopark;

import java.util.Objects;

public class Car {
    private String brand;
    private double power;
    private Owner owner;
    private int price;
    private int year;

    public Car() {
    }

    public Car(String brand, double power, Owner owner, int price, int year) {
        this.brand = brand;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(power, car.power) != 0) return false;
        if (price != car.price) return false;
        if (year != car.year) return false;
        if (!Objects.equals(brand, car.brand)) return false;
        return Objects.equals(owner, car.owner);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        temp = Double.doubleToLongBits(power);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
