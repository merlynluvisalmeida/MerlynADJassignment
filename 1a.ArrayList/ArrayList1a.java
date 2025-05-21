package arrayList;
	

	
	import java.util.*;
	public class ArrayList1a {
	    

	    	
	    	    public static void main(String[] args) {
	    	        // 1. Adding elements
	    	        ArrayList<String> arrayList = new ArrayList<>();
	    	        LinkedList<String> linkedList = new LinkedList<>();

	    	        addElements(arrayList);
	    	        addElements(linkedList);

	    	        // 2. Adding element at specific index
	    	        arrayList.add(1, "Grapes");
	    	        linkedList.add(1, "Grapes");

	    	        // 3. Adding multiple elements
	    	        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
	    	        arrayList.addAll(moreFruits);
	    	        linkedList.addAll(moreFruits);

	    	        // 4. Accessing elements
	    	        System.out.println("Access from ArrayList: " + arrayList.get(2));
	    	        System.out.println("Access from LinkedList: " + linkedList.get(2));

	    	        // 5. Updating elements
	    	        arrayList.set(0, "Kiwi");
	    	        linkedList.set(0, "Kiwi");

	    	        // 6. Removing elements
	    	        arrayList.remove("Banana");
	    	        linkedList.remove("Banana");

	    	        // 7. Searching elements
	    	        System.out.println("ArrayList contains Orange? " + arrayList.contains("Orange"));
	    	        System.out.println("LinkedList contains Orange? " + linkedList.contains("Orange"));

	    	        // 8. List size
	    	        System.out.println("ArrayList size: " + arrayList.size());
	    	        System.out.println("LinkedList size: " + linkedList.size());

	    	        // 9. Iterating over list using for-each
	    	        System.out.println("ArrayList elements:");
	    	        for (String fruit : arrayList) {
	    	            System.out.println(fruit);
	    	        }

	    	        System.out.println("LinkedList elements:");
	    	        for (String fruit : linkedList) {
	    	            System.out.println(fruit);
	    	        }

	    	        // 10. Using Iterator
	    	        System.out.println("Iterating ArrayList using Iterator:");
	    	        Iterator<String> it1 = arrayList.iterator();
	    	        while (it1.hasNext()) {
	    	            System.out.println(it1.next());
	    	        }

	    	        System.out.println("Iterating LinkedList using Iterator:");
	    	        Iterator<String> it2 = linkedList.iterator();
	    	        while (it2.hasNext()) {
	    	            System.out.println(it2.next());
	    	        }

	    	        // 11. Sorting
	    	        Collections.sort(arrayList);
	    	        Collections.sort(linkedList);
	    	        System.out.println("Sorted ArrayList: " + arrayList);
	    	        System.out.println("Sorted LinkedList: " + linkedList);

	    	        // 12. Sublist
	    	        System.out.println("Sublist of ArrayList (0 to 2): " + arrayList.subList(0, 2));
	    	        System.out.println("Sublist of LinkedList (0 to 2): " + linkedList.subList(0, 2));

	    	        // 13. Clearing the list
	    	        arrayList.clear();
	    	        linkedList.clear();
	    	        System.out.println("ArrayList after clearing: " + arrayList);
	    	        System.out.println("LinkedList after clearing: " + linkedList);
	    	    }

	    	    // Function to add initial elements
	    	    public static void addElements(List<String> list) {
	    	        list.add("Apple");
	    	        list.add("Banana");
	    	        list.add("Orange");
	    	    }
	    	}