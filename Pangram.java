package pangram.java;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase(); 
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are present
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}