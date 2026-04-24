// Q4: Palindrome check ignoring case and punctuation

package Com.String;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        // Remove punctuation and spaces, convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}