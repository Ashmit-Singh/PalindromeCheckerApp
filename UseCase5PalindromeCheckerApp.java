import java.util.Stack;

/**
 * ==================================================
 *
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 *
 * ==================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by pushing all characters onto a Stack and then
 * popping them to compare with the original string.
 *
 * At this stage, the application:
 * - Pushes each character into a Stack
 * - Pops characters and compares with original order
 * - Determines whether the string is a palindrome
 * - Displays the validation result
 *
 * The Stack naturally reverses the order of elements
 * (LIFO), making it ideal for palindrome validation.
 *
 * @author Developer
 * @version 5.0
 *          ==================================================
 */
public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        // Pop from stack gives characters in reverse order (LIFO).
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
