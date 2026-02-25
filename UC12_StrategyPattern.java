/**
 * ==================================================
 * MAIN CLASS - UC12_StrategyPattern
 * ==================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Defines PalindromeStrategy interface with
 * StackPalindromeStrategy and DequePalindromeStrategy.
 * Strategy is injected at runtime (polymorphism).
 *
 * @author Developer
 * @version 12.0
 *          ==================================================
 */
public class UC12_StrategyPattern {
    public static void main(String[] args) {
        String input = "deified";

        PalindromeStrategy strategy1 = new StackPalindromeStrategy();
        System.out.println("Strategy : StackPalindromeStrategy");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + strategy1.check(input));
        System.out.println();

        PalindromeStrategy strategy2 = new DequePalindromeStrategy();
        System.out.println("Strategy : DequePalindromeStrategy");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + strategy2.check(input));
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackPalindromeStrategy implements PalindromeStrategy {
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

class DequePalindromeStrategy implements PalindromeStrategy {
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
