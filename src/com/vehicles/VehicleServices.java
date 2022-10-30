package com.vehicles;

public class VehicleServices {

    public static void main(String[] args) {
        Bike bike= new Bike("BMW", "X30", "cruiser");
        System.out.println("Bike type is: cruiser & Speed is: " + bike.maxSpeed("cruiser")+ "km/h");
        System.out.println(bike.getManufacturerInformation());


        System.out.println();

        Car car= new Car("Tesla", "S3", "sportsCar");
        System.out.println("Car type is: Sedan & Speed is: " + car.maxSpeed("SportsCar")+"km/h");
        System.out.println(car.getManufacturerInformation());

    }
}
