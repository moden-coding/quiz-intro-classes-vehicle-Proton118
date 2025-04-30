public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double fuel;
    private boolean isOperational;

    public Vehicle(String make, String model, int year, double fuel){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = fuel; 
        isOperational = fuel > 0;
    }

    public boolean drive(){
        if(fuel >= 10){
            fuel -= 10;
            isOperational = fuel > 0;
            return true;
        }
        return false;
    }

    public void refuel(double amount){
        fuel += amount;
    }

    public String toString(){
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel: " + fuel;
    }
}