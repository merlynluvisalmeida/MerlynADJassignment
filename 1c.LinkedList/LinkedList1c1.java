package linkedList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class LinkedList1c1 {




    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");

        // Display the original list
        System.out.println("Original LinkedList: " + colors);

        // Create an iterator starting from the 2nd element (index 1)
        Iterator<String> iterator = colors.listIterator(1);

        // Iterate and print elements from the 2nd position onwards
        System.out.println("Iterating from 2nd position (index 1):");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
