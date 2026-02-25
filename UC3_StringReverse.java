/**
 * ==================================================
 *
 * MAIN CLASS - UC3_StringReverse
 *
 * ==================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 *          ==================================================
 */
public class UC3_StringReverse {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ── Display Application Header ──
        System.out.println("==================================================");
        System.out.println("       PALINDROME CHECKER APPLICATION");
        System.out.println("==================================================");
        System.out.println("  UC3: Palindrome Check Using String Reverse");
        System.out.println("==================================================");
        System.out.println();

        // ── Original string to check ──
        String input = "madam";

        System.out.println("Original String  : \"" + input + "\"");

        // ── Reverse the string using a for loop ──
        // String concatenation (+) is used here to build the reversed string
        // character by character. Note: Strings in Java are immutable,
        // so each concatenation creates a new String object.
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed String  : \"" + reversed + "\"");
        System.out.println();

        // ── Compare using equals() method ──
        // equals() compares the actual content of two String objects
        // instead of comparing memory references (==).
        if (input.equals(reversed)) {
            System.out.println("Result           : \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result           : \"" + input + "\" is NOT a Palindrome.");
        }

        // ── End of UC3 ──
        System.out.println();
        System.out.println("==================================================");
        System.out.println("  UC3 Complete - String reverse validation done.");
        System.out.println("==================================================");
    }
}


