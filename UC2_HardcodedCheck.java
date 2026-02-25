/**
 * ==================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 *          ==================================================
 */
public class UC2_HardcodedCheck {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ── Display Application Header ──
        System.out.println("==================================================");
        System.out.println("       PALINDROME CHECKER APPLICATION");
        System.out.println("==================================================");
        System.out.println("  UC2: Print a Hardcoded Palindrome Result");
        System.out.println("==================================================");
        System.out.println();

        // ── Hardcoded string to check ──
        String input = "madam";

        System.out.println("Input String : \"" + input + "\"");
        System.out.println();

        // ── Palindrome check using character comparison ──
        // Loop only till half of the string length.
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character from front with character from back
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // ── Display Result ──
        if (isPalindrome) {
            System.out.println("Result       : \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result       : \"" + input + "\" is NOT a Palindrome.");
        }

        // ── End of UC2 ──
        System.out.println();
        System.out.println("==================================================");
        System.out.println("  UC2 Complete - Hardcoded palindrome validated.");
        System.out.println("==================================================");
    }
}


