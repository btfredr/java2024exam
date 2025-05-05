package Task6;
/*
    • Task 6.9: Additional field in the Truck subclass (2 points)
    o The Truck subclass should contain an additional field that stores the cargo capacity in
    tons.

    • Task 6.10: Polymorphic print methods in Truck (4 points)
    o Use polymorphism to create two methods in the Truck class to print information
    about the truck:
    § One method should print only the model and year.
    § The other method should print all available information, including the cargo
    capacity.
 */
public class Truck extends Vehicle {
    private double cargoCapacity;

    // Constructor that extends the superclass
    public Truck(int ID, String model, int year, double cargoCapacity) {
        super(ID, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void printModelAndYear() {
        System.out.println("Truck info: ");
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
    }

    public void printAllInfo() {
        System.out.println("All truck info:");
        System.out.println("ID: " + getID());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Cargo capacity: " + getCargoCapacity());
    }
}
