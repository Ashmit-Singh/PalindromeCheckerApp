import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ==================================================
 * MAIN CLASS - UC7_DequeOptimized
 * ==================================================
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * Uses Deque removeFirst/removeLast for efficient
 * bidirectional comparison.
 *
 * @author Developer
 * @version 7.0
 *          ==================================================
 */
public class UC7_DequeOptimized {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
