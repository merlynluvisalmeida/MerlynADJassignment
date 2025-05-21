package twoa;
import java.util.Scanner;
public class Threec2 {





    // User-defined function to truncate string
    public static String truncate(String input, int maxLength) {
        if (input == null || maxLength < 0) {
            return "";
        }

        // If the input string is shorter than or equal to maxLength, return it as is
        if (input.length() <= maxLength) {
            return input;
        }

        // If maxLength is less than or equal to 3, just return "..." (not enough room for content)
        if (maxLength <= 3) {
            return "...".substring(0, maxLength);
        }

        // Truncate and add ellipsis
        return input.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.print("Enter the maximum length: ");
        int maxLength = scanner.nextInt();

        String result = truncate(userInput, maxLength);

        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
