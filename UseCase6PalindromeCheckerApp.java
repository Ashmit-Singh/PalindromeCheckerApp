import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ==================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ==================================================
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * Demonstrates FIFO vs LIFO using Queue and Stack.
 * Compares dequeue (front) with pop (top/reverse).
 *
 * @author Developer
 * @version 6.0
 *          ==================================================
 */
public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
