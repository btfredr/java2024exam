package Task6;

/*
    Task 6. (35 points)
    The task is to create a Java program that supports the management of vehicles in a transportation
    company.

    • Task 6.1: Create a class named Vehicle (4 points)
    o Create a class named Vehicle that contains data fields for the vehicle's ID, model,
    and year. Include getter and setter methods for these fields.

    • Task 6.2: Constructors for Vehicle (3 points)
    o The Vehicle class should have two constructors:
    § One constructor with two arguments (ID, model).
    § Another with three arguments (ID, model, year).

    • Task 6.3: Print method for Vehicle (3 points)
    o Implement a print method in the Vehicle class that outputs a message about the
    model and year of the vehicle.

    • Task 6.4: Create two subclasses: Car and Truck (4 points)
    o Develop two subclasses that extend the Vehicle class. These subclasses should be
    named Car and Truck.

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

    • Task 6.9: Additional field in the Truck subclass (2 points)
    o The Truck subclass should contain an additional field that stores the cargo capacity in
    tons.

    • Task 6.10: Polymorphic print methods in Truck (4 points)
    o Use polymorphism to create two methods in the Truck class to print information
    about the truck:
    § One method should print only the model and year.
    § The other method should print all available information, including the cargo
    capacity.

    • Task 6.11: Test class with a main method (5 points)
    o Create a simple Test class with a main method to create instances of one Car and one
    Truck and print details from both.

    Pay attention to the use of access modifiers and the readability of the code. During the assessment
    of this task, special attention will be focused on the ability to implement fundamental principles of
    object-oriented programming: inheritance, encapsulation, and polymorphism.
 */

public class Vehicle {
    // Data fields
    private int ID;
    private String model;
    private int year;

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}