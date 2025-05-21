package twoa;

import java.util.Scanner;
import java.util.Random;
public class Threec4 {




    // User-defined function to generate random string
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the random string
        System.out.print("Enter the length of the random string: ");
        int length = scanner.nextInt();

        // Generate and display the random string
        String randomString = generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);

        scanner.close();
    }
}
