package linkedList;
import java.util.LinkedList;
public class LinkedList1c4 {
	

	
	    public static void main(String[] args) {
	        // Create a LinkedList of Strings
	        LinkedList<String> l_listobj = new LinkedList<>();

	        // Add some elements to the LinkedList
	        l_listobj.add("Apple");
	        l_listobj.add("Banana");
	        l_listobj.add("Cherry");
	        l_listobj.add("Date");
	        l_listobj.add("Elderberry");

	        // Display elements with their positions using l_listobj.get(p)
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int p = 0; p < l_listobj.size(); p++) {
	            System.out.println("Position " + p + ": " + l_listobj.get(p));
	        }
	    }
	}


