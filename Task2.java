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


        for (int i = 1; i > 0; i++) {
            for (int j = 1; j > 0; j++) {

            }
        }
    }
}
