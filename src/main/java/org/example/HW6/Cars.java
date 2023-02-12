package HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    String cars;
    String color;
    int price;

    public String getCars() {
        return cars;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Cars(String cars, String color, int price) {
        this.cars = cars;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "cars{" +
                "cars='" + cars + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Cars car1 = new Cars("BMW", "red", 50);
        Cars car2 = new Cars("Mercedes", "white", 60);
        Cars car3 = new Cars("Audi", "black", 70);
        List<Cars> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);
        System.out.println(cars.stream().filter(car -> car.getColor() == "black").collect(Collectors.toList()));
        System.out.println(cars.stream().filter(car -> car.getPrice() > 50).collect(Collectors.toList()));
    }
}
