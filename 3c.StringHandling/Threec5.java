package twoa;
import java.util.Scanner;
public class Threec5 {





    // User-defined function to count words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more whitespace characters
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the user-defined function
        int wordCount = countWords(input);

        // Display the result
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
