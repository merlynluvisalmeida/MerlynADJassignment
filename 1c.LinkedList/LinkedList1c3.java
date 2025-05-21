package linkedList;
import java.util.LinkedList;

public class LinkedList1c3 {
	

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> l_list = new LinkedList<>();

	        // Add some initial elements
	        l_list.add("Red");
	        l_list.add("Blue");
	        l_list.add("Green");

	        // Display the original list
	        System.out.println("Original LinkedList: " + l_list);

	        // Insert "Pink" at the end using offerLast()
	        l_list.offerLast("Pink");

	        // Display the updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end: " + l_list);
	    }
	}


