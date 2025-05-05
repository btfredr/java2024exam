package Task6;

/*
    • Task 6.5: Additional fields in the Car subclass (1 point)
    o The Car subclass should include:
    § A field that holds the number of doors.
    § A field that indicates whether the car is electric.

    • Task 6.6: Constructor for Car (3 points)
    o The Car class should have an additional constructor that updates the two new fields
    in addition to the constructor from the superclass.

    • Task 6.7: Methods in Car (3 points)
    o Add methods getNumberOfDoors and isElectric that read and return the values of
    the fields doors and electric, respectively.

    • Task 6.8: Override print method in Car (3 points)
    o Override the print method from the superclass to create a method in the Car class
    that prints information from all available fields.
 */

public class Car extends Vehicle {
    private int numOfDoors;
    private boolean isElectric;

    // Constructor that extends the superclass
    public Car(int ID, String model, int year, int numOfDoors, boolean isElectric) {
        super(ID, model, year);
        this.numOfDoors = numOfDoors;
        this.isElectric = isElectric;
    }

    // Get methods
    public int getNumberOfDoors() {
        return numOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public void print() {
        System.out.println("Car information:");
        System.out.println("ID: " + getID());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of doors: " + getNumberOfDoors());
        System.out.println("Electric: " + isElectric());
    }
}
