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
        analyzeString("Java programming 101");
    }

    public static void analyzeString(String input) {

        int vowelCount = 0;
        int consonantCount = 0;
        int digitCount = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char lowerC = Character.toLowerCase(c); // Gjør c til liten bokstav

            for(char vowel : vowels) { // Sjekker om det er vokaler i strengen
                if(lowerC == vowel) {
                    vowelCount++;
                }
            }

            for(char consonant : consonants) { // Sjekker om det er konsonanter i strengen
                if(lowerC == consonant) {
                    consonantCount++;
                }
            }

            if (Character.isDigit(c)) { // Sjekker om det er tall i strengen
                digitCount++;
            }

        }

        System.out.println("String information: ");
        System.out.println("The string contains " + vowelCount + " vowels!");
        System.out.println("The string contains " + consonantCount + " consonants!");
        System.out.println("The string is " + input.length() + " characters long!");
        System.out.println("The string contains " + digitCount + " digits!");
    
    }
}
