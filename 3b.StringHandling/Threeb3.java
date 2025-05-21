package twoa;

import java.util.Scanner;
public class Threeb3 {





    // User-defined function to reverse the string
    public static String reverseString(String input) {
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        // Calling the user-defined function
        String reversed = reverseString(original);

        // Output the result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
