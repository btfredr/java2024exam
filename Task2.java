/*
    Task 2. (15 points)

    Write a Java program that uses nested for loops to print out an inverted pyramid of numbers. The
    pyramid should have a number of rows equal to the height specified by the user. Each row should
    display decrementing numbers starting from the row number. For example, if the user specifies a
    height of 4, the pyramid printed should look like this:

        4 3 2 1
        3 2 1
        2 1
        1

    The program should prompt the user to enter the desired height and output the pyramid
    accordingly. Each level of the pyramid should have decreasing numbers starting from the row
    number down to 1
 */

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number of rows: ");
        int height = scanner.nextInt();

        scanner.close();


        for (int i = height; i >= 1; i--) { // Teller nedover fra height

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " "); // Printer height i synkende rekkefølge, med mellomrom
            }

            System.out.println(); // Linjeskift
        }
    }
}
