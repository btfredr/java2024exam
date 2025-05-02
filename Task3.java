/*
    Task 3 . (15 points)

    Write a method that takes an integer number n as an argument. If n is positive, the program should
    use a do-while loop to write an ascending count from n to n + 5. If n is negative, the program should
    print the square of the absolute value of n.

    • E.g. 1: for n = 3, the program should write: 3,4,5,6,7,8
    • E.g. 2: for n = -4, the program should write: 16
 */


public class Task3 {
    public static void main(String[] args) {
        positiveOrNegative(3);
        positiveOrNegative(-4);
    }

    public static void positiveOrNegative(int n) {

        int count = n;
        int max = n + 5;

        if (n > 0) {
            while (count <= max) {
                System.out.print(count + ", ");
                count++;
            }
            System.out.println();
        } else {
            System.out.println("Absolute value of n: ");
            System.out.println(n*n);
        }
    }
}
