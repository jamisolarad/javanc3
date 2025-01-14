package chapter5;

class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors;   
    
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;  
    }

    public void carDetails() {
        System.out.println("Car Details: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    
    }
}

public class Tasksheet125 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
            car.carDetails();
    }
}
