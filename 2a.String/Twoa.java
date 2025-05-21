package twoa;

public class Twoa {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2: " + str1.equals(str2));
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String sample = "This is a sample string.";
	        System.out.println("Index of 'sample': " + sample.indexOf("sample"));
	        System.out.println("Contains 'is': " + sample.contains("is"));

	        // 5. Substring Operations
	        System.out.println("Substring (5 to 11) of sample: " + sample.substring(5, 11));

	        // 6. String Modification
	        String modified = sample.replace("sample", "test");
	        System.out.println("Modified string: " + modified);
	        System.out.println("Uppercase: " + str1.toUpperCase());
	        System.out.println("Lowercase: " + str2.toLowerCase());

	        // 7. Whitespace Handling
	        String spaced = "   Trim me   ";
	        System.out.println("Original with spaces: '" + spaced + "'");
	        System.out.println("Trimmed: '" + spaced.trim() + "'");

	        // 8. String Concatenation
	        String concatenated = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated: " + concatenated);

	        // 9. String Splitting
	        String csv = "Apple,Banana,Orange";
	        String[] fruits = csv.split(",");
	        System.out.println("Split fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder();
	        sb.append("Java");
	        sb.append(" Programming");
	        sb.insert(4, " Language");
	        sb.replace(5, 13, "is Fun");
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 25;
	        System.out.printf("Formatted string: Name: %s, Age: %d\n", name, age);

	        // 12. Validate Email using contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";
	        boolean isValid = email.contains("@") && email.startsWith("example") && email.endsWith(".com");
	        System.out.println("Email: " + email);
	        System.out.println("Is valid email: " + isValid);
	    }
	}


