package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public String getManufacturerInformation() {
        return "Car Manufacturer{" +
                "Name='" + getVehicleName() + '\'' +
                ", ModelName='" + getVehicleModelName() + '\'' +
                ", Type='" + getVehicleType() + '\'' +
                '}';
    }

    @Override
    public int maxSpeed(String vehicleType) {
        if(vehicleType=="sportsCar"|| vehicleType=="SportsCar")
            return 250;
        else if (vehicleType=="Sedan"|| vehicleType=="sedan")
            return 170;
        else return 0;
    }
}
