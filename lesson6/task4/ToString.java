package homework.lesson6.task4;

import homework.lesson6.task2.*;

public class ToString {
    public static void main(String[] args) {
        Bus buses = new Bus("","Икарус");
        System.out.println(buses.toString());
        Truck trucks = new Truck("", "Камаз");
        System.out.println(trucks.toString());
        Spacecraft spacecraft = new Spacecraft("","Союз - МС");
        System.out.println(spacecraft.toString());
        Motorcycle motorcycles = new Motorcycle("","Урал");
        System.out.println(motorcycles.toString());
        Locomotive locomotives = new Locomotive("","ЧМЭЗ РЖД");
        System.out.println(locomotives.toString());
        LaunchVehicle launchVehicles = new LaunchVehicle("","Протон - М");
        System.out.println(launchVehicles.toString());
        Helicopter helicopters = new Helicopter("", "МИ - 24");
        System.out.println(helicopters.toString());
        Coach coach = new Coach("","Красная стрела");
        System.out.println(coach.toString());
        FreightCar freightCars = new FreightCar("","B - 012");
        System.out.println(freightCars.toString());
        Car cars = new Car("","Тайота");
        System.out.println(cars.toString());
        Aircraft aircraft = new Aircraft("", "ТУ - 134");
        System.out.println(aircraft.toString());

    }

}
