package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1b5 {




    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original color list: " + colors);

        // Input n from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the element to delete (starting from 1): ");
        int n = scanner.nextInt();

        // Validate and remove element at n-1 (since ArrayList is 0-indexed)
        if (n >= 1 && n <= colors.size()) {
            String removedColor = colors.remove(n - 1);
            System.out.println("Removed color: " + removedColor);
        } else {
            System.out.println("Invalid position! Please enter a number between 1 and " + colors.size());
        }

        // Display the updated list
        System.out.println("Updated color list: " + colors);
    }
}
