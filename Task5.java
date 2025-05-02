/*
    Task 5. (15 points)

    Write a Java program that analyzes the input string using the method:
    public void analyzeString(String input){}
    The analysis should include: the number of vowels, the number of consonants, the string length,
    and the number of digits.

    • E.g., if the input string is: "Java Programming 101", the method should print:
    o The string contains 5 vowels!
    o The string contains 10 consonants!
    o The string is 20 characters long!
    o The string contains 3 digits!
 */


public class Task5 {
    public static void main(String[] args) {

    }

    public void analyzeString(String input) {

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
        }
    
    }
}
