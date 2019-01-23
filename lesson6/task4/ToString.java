package homework.lesson6.task4;

import homework.lesson6.task2.*;

public class ToString {
    public static void main(String[] args) {
        Buses buses = new Buses("");
        System.out.println(buses.toString());
        Trucks trucks = new Trucks("");
        System.out.println(trucks.toString());
        Spacecraft spacecraft = new Spacecraft("");
        System.out.println(spacecraft.toString());
        Motorcycles motorcycles = new Motorcycles("");
        System.out.println(motorcycles.toString());
        Locomotives locomotives = new Locomotives("");
        System.out.println(locomotives.toString());
        LaunchVehicles launchVehicles = new LaunchVehicles("");
        System.out.println(launchVehicles.toString());
        Helicopters helicopters = new Helicopters("");
        System.out.println(helicopters.toString());
        Coach coach = new Coach();
        System.out.println(coach.toString());
        FreightCars freightCars = new FreightCars();
        System.out.println(freightCars.toString());
        Cars cars = new Cars("");
        System.out.println(cars.toString());
        Aircraft aircraft = new Aircraft("");
        System.out.println(aircraft.toString());

    }

}
