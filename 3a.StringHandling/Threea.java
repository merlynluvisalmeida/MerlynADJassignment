package twoa;

public class Threea {


    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 of str1: " + str1.charAt(2));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        String sample = "The quick brown fox jumps over the lazy dog";
        System.out.println("Index of 'fox' in sample: " + sample.indexOf("fox"));
        System.out.println("Does sample contain 'dog'? " + sample.contains("dog"));

        // 5. Substring Operations
        System.out.println("Substring from index 4 to 9: " + sample.substring(4, 9));

        // 6. String Modification
        String replaced = sample.replace("brown", "black");
        System.out.println("After replacement: " + replaced);
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // 7. Whitespace Handling
        String spaced = "   Trim me please   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenated);

        // 9. String Splitting
        String csv = "Apple,Banana,Orange";
        String[] fruits = csv.split(",");
        System.out.println("Split fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.replace(5, 13, "is Fun");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 30;
        System.out.printf("Formatted output: Name = %s, Age = %d%n", name, age);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "user@example.com";
        boolean validEmail = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is valid email? " + validEmail);
    }
}
