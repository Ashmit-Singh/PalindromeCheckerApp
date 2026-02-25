import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * ==================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==================================================
 * Use Case 13: Performance Comparison
 *
 * Description:
 * Benchmarks 4 algorithms (Two-Pointer, Stack, Deque,
 * Recursive) using System.nanoTime().
 *
 * @author Developer
 * @version 13.0
 *          ==================================================
 */
public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "abacaba";
        System.out.println("Input : " + input);
        System.out.println("========================================");

        long s1 = System.nanoTime();
        boolean r1 = checkTwoPointer(input);
        long e1 = System.nanoTime();
        System.out.println("Algorithm : Two-Pointer");
        System.out.println("Is Palindrome? : " + r1);
        System.out.println("Time (ns) : " + (e1 - s1));
        System.out.println("----------------------------------------");

        long s2 = System.nanoTime();
        boolean r2 = checkStack(input);
        long e2 = System.nanoTime();
        System.out.println("Algorithm : Stack-Based");
        System.out.println("Is Palindrome? : " + r2);
        System.out.println("Time (ns) : " + (e2 - s2));
        System.out.println("----------------------------------------");

        long s3 = System.nanoTime();
        boolean r3 = checkDeque(input);
        long e3 = System.nanoTime();
        System.out.println("Algorithm : Deque-Based");
        System.out.println("Is Palindrome? : " + r3);
        System.out.println("Time (ns) : " + (e3 - s3));
        System.out.println("----------------------------------------");

        long s4 = System.nanoTime();
        boolean r4 = checkRecursive(input, 0, input.length() - 1);
        long e4 = System.nanoTime();
        System.out.println("Algorithm : Recursive");
        System.out.println("Is Palindrome? : " + r4);
        System.out.println("Time (ns) : " + (e4 - s4));
        System.out.println("========================================");
    }

    private static boolean checkTwoPointer(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        }
        return true;
    }

    private static boolean checkStack(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray())
            st.push(c);
        for (char c : s.toCharArray()) {
            if (c != st.pop())
                return false;
        }
        return true;
    }

    private static boolean checkDeque(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray())
            dq.addLast(c);
        while (dq.size() > 1) {
            if (!dq.removeFirst().equals(dq.removeLast()))
                return false;
        }
        return true;
    }

    private static boolean checkRecursive(String s, int l, int r) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return checkRecursive(s, l + 1, r - 1);
    }
}
