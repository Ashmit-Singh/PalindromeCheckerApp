/**
 * ==================================================
 *
 * MAIN CLASS - UC04_CharArrayTwoPointer
 *
 * ==================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it to a character array and using the
 * two-pointer technique for comparison.
 *
 * At this stage, the application:
 * - Converts the string into a char[]
 * - Uses two pointers (start and end)
 * - Compares characters from both ends
 * - Displays the validation result
 *
 * This demonstrates efficient index-based access
 * without creating extra String objects.
 *
 * @author Developer
 * @version 4.0
 *          ==================================================
 */
public class UC04_CharArrayTwoPointer {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string.
        String input = "radar";

        // Convert the string into a character array.
        char[] chars = input.toCharArray();

        // Initialize pointer at the beginning.
        int start = 0;

        // Initialize pointer at the end.
        int end = chars.length - 1;

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Continue comparison until pointers cross.
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

