package twoa;
import java.util.Scanner;
public class Threeb2 {





    // User-defined function to count substring occurrences
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the last found index
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input main string and substring
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String subStr = scanner.nextLine();

        // Count and display the number of occurrences
        int result = countOccurrences(mainStr, subStr);
        System.out.println("The substring '" + subStr + "' appears " + result + " time(s) in the main string.");
    }
}
