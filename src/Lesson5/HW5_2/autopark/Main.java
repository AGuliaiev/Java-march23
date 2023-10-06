package Lesson5.HW5_2.autopark;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("BMW", 200, new Owner("Max", 21, 3), 25000, 2000),
                new Car("AUDI", 250, new Owner("Kira", 26, 6), 25000, 2010),
                new Car("VOLVO", 180, new Owner("Luda", 29, 2), 28000, 2013),
                new Car("Lada", 102, new Owner("Vasil", 23, 5), 24000, 2020)
        );

        for (int i = 0; i < cars.size()/2; i++) {
            Car car = cars.get(i);
            car.setPower(car.getPower() + car.getPower()*0.1);
        }
        System.out.println(cars);

        cars.stream().filter(car -> car.getOwner().getAge()>25&&car.getOwner().getExp()<5).forEach(car -> car.getOwner().setExp(car.getOwner().getExp()+1));
        System.out.println(cars);
        Integer sum = cars.stream().map(Car::getPrice).reduce(0, Integer::sum);
        System.out.println(sum);


    }

}
