/*
    Task 4 (10 points)

    Write a Java program that reads a distance in kilometers from the user and converts it to miles
    using the formula: miles = kilometers * 0.621371. For example:

    • E.g. 1: If kilometers is 1, the method returns 0.621371.
    • E.g. 2: If kilometers is 5, the method returns 3.106855.
 */


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an amount of kilometers: ");
        double km = scanner.nextDouble();

        scanner.close();

        double miles = km * 0.621371;

        System.out.print(km + " kilometers equals " + miles + " miles.");
    }

}
