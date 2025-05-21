package twoa;
import java.util.Scanner;
public class Threeb5 {



    // User-defined function to remove all whitespace characters from a string
    public static String removeWhitespace(String input) {
        // Using regular expression to replace all whitespace characters with an empty string
        return input.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling the removeWhitespace() function
        String result = removeWhitespace(userInput);

        // Displaying the result
        System.out.println("String after removing whitespace: " + result);

        scanner.close();
    }
}
