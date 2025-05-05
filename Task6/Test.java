package Task6;

/*
    • Task 6.11: Test class with a main method (5 points)
    o Create a simple Test class with a main method to create instances of one Car and one
    Truck and print details from both.

    Pay attention to the use of access modifiers and the readability of the code. During the assessment
    of this task, special attention will be focused on the ability to implement fundamental principles of
    object-oriented programming: inheritance, encapsulation, and polymorphism.
 */

public class Test {
    
    public static void main(String[] args) {
        Car c1 = new Car(1, "Hellcat", 2025, 4, false);
        Truck t1 = new Truck(2, "Scania", 1995, 4.5);
    }
}
