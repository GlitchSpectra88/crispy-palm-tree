import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("✅ It's a palindrome!");
        } else {
            System.out.println("❌ Not a palindrome.");
        }
    }
}
