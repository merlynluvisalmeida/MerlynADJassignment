package twoa;
import java.util.Scanner;
public class Threec3 {





    // User-defined function to check if a string contains only numeric characters
    public static boolean isNumeric(String input) {
        return input.matches("[0-9]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling the isNumeric() function
        if (isNumeric(userInput)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}
