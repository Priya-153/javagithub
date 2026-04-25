package pg3;

public class StringOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // String Creation
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // String Comparison
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

        // String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Contains 'lo': " + str1.contains("lo"));

        // Substring Operations
        System.out.println("Substring (1,4): " + str1.substring(1, 4));

        // String Modification
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace l with x: " + str1.replace('l', 'x'));

        // Whitespace Handling
        String str3 = "   Java Programming   ";
        System.out.println("Before Trim: '" + str3 + "'");
        System.out.println("After Trim: '" + str3.trim() + "'");

        // String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // String Splitting
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("Words after splitting:");
        for (String word : words) {
            System.out.println(word);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder Output: " + sb);

        // String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted String: " + formatted);

        // Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}