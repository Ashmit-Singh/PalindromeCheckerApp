import java.util.Stack;

/**
 * ==================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ==================================================
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * Pushes chars onto a Stack, pops and compares
 * with original order (LIFO reversal).
 *
 * @author Developer
 * @version 5.0
 *          ==================================================
 */
public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
