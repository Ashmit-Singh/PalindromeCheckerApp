/**
 * ==================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Defines PalindromeStrategy interface with
 * StackStrategy and DequeStrategy implementations.
 * Strategy is injected at runtime (polymorphism).
 *
 * @author Developer
 * @version 12.0
 *          ==================================================
 */
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "deified";

        PalindromeStrategy strategy1 = new StackStrategy();
        System.out.println("Strategy : StackStrategy");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + strategy1.check(input));
        System.out.println();

        PalindromeStrategy strategy2 = new DequeStrategy();
        System.out.println("Strategy : DequeStrategy");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + strategy2.check(input));
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray())
            stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        java.util.Deque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : input.toCharArray())
            deque.addLast(c);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }
        return true;
    }
}
