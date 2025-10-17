import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Task 1: Working with String Methods
        String str = " Welcome to the Java String Lab! ";

        System.out.println("--- Task 1: String Methods ---");
        System.out.println("Original String: \"" + str + "\"");

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring()
        System.out.println("Substring 'Java': " + str.substring(18, 22)); // Adjust indices based on actual string

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // contains()
        System.out.println("Contains 'Lab': " + str.contains("Lab"));

        // replace()
        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        // split()
        System.out.println("Splitting by spaces:");
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // trim()
        System.out.println("Trimmed: \"" + str.trim() + "\"");

        // equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals 'java string lab!': " + str.equals(compareStr));
        System.out.println("EqualsIgnoreCase 'java string lab!': " + str.equalsIgnoreCase(compareStr));

        System.out.println("\n--- Task 2: Loop Challenges ---");

        // For Loop: Count Vowels
        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in original string: " + vowelCount);

        // While Loop: Check for Palindrome
        String palindromeWord = "racecar";
        boolean isPalindrome = true;
        int left = 0;
        int right = palindromeWord.length() - 1;
        while (left < right) {
            if (palindromeWord.charAt(left) != palindromeWord.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("'" + palindromeWord + "' is a palindrome: " + isPalindrome);

        // Do...While Loop: Input Validation
        Scanner scanner = new Scanner(System.in);
        String sentence;
        do {
            System.out.print("Enter a sentence containing 'Java': ");
            sentence = scanner.nextLine();
        } while (!sentence.contains("Java"));
        System.out.println("Thank you!");

        System.out.println("\n--- Task 3: StringBuilder ---");
        StringBuilder stringBuilder = new StringBuilder("StringBuilder Lab");
        System.out.println("Initial StringBuilder: " + stringBuilder);

        // append()
        stringBuilder.append(" - Learning Java");
        System.out.println("After append: " + stringBuilder);

        // insert()
        stringBuilder.insert(stringBuilder.indexOf("Lab") + 3, " is fun"); // Insert after "Lab"
        System.out.println("After insert: " + stringBuilder);

        // delete()
        int learningIndex = stringBuilder.indexOf("Learning");
        stringBuilder.delete(learningIndex, learningIndex + "Learning".length());
        System.out.println("After delete: " + stringBuilder);

        // reverse()
        stringBuilder.reverse();
        System.out.println("After reverse: " + stringBuilder);

        System.out.println("\n--- Task 4: StringBuffer ---");
        StringBuffer stringBuffer = new StringBuffer("Multithreading Lab");
        System.out.println("Initial StringBuffer: " + stringBuffer);

        // append()
        stringBuffer.append(" - Learning Java");
        System.out.println("After append: " + stringBuffer);

        // insert()
        stringBuffer.insert(stringBuffer.indexOf("Lab") + 3, " is fun"); // Insert after "Lab"
        System.out.println("After insert: " + stringBuffer);

        // delete()
        int learningIndexBuffer = stringBuffer.indexOf("Learning");
        stringBuffer.delete(learningIndexBuffer, learningIndexBuffer + "Learning".length());
        System.out.println("After delete: " + stringBuffer);

        // reverse()
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);

        scanner.close();
    }
}
