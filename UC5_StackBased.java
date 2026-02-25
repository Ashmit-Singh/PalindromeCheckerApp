import java.util.Stack;

/**
 * ==================================================
 * MAIN CLASS - UC5_StackBased
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
public class UC5_StackBased {
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
