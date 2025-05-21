package twoa;
import java.util.Scanner;
public class Threec1 {





    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String input) {
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append the rest of the word
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Calling the user-defined function
        String capitalized = capitalizeWords(sentence);

        // Output the result
        System.out.println("Capitalized Sentence: " + capitalized);

        scanner.close();
    }
}
