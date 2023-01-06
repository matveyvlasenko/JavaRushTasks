package com.javarush.task.pro.task18.task1820;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* 
Самый дорогой автомобиль
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X7", 143_000),
                new Car("X6", 125_000)
        );

        Optional<Car> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car> moreExpensiveCar = mostExpensiveCar
                .flatMap(mostExpTesla -> getMoreExpensiveCar(bmw, mostExpTesla));
        moreExpensiveCar.ifPresent(System.out::println);
    }
    //mylist1.stream.max(s ->

    public static Optional<Car> getMostExpensiveCar(Stream<Car> cars) {
       return cars.max((car1,car2) -> car1.getPrice()- car2.getPrice());
    }

    public static Optional<Car> getMoreExpensiveCar(Stream<Car> cars, Car mostExpensiveCar) {
        Stream<Car> filteredBMWStream = cars.filter(car1 -> car1.getPrice() > mostExpensiveCar.getPrice());
        return filteredBMWStream.findFirst();
    }

}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}





