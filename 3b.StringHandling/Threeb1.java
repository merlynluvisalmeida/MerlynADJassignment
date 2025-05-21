package twoa;
import java.util.Scanner;
public class Threeb1 {




    
    // User-defined function to check if string is null or only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Check using isNullOrEmpty()
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is valid: '" + input + "'");
        }
    }
}
