/*
    Task 1. (10 points)

    Write a method that takes a double value as an argument and returns the smallest even integer
    number greater than or equal to the input number. For example:

    • For input = 25.2, the method returns 26.
    • For input = 7.0, the method returns 8.
    • For input = -5.75, the method returns -4.
 */

public class Task1 {

    public static void main(String[] args) {

    }

    public int smallestInt(double input) {
        
        if (input % 2 != 0) {
            int result = (int) input + 1;
            return result;
        } else {
            int res = (int) input + 2;
            return res;
        }
    }
}