/**
 * ==================================================
 * MAIN CLASS - UC9_RecursivePalindrome
 * ==================================================
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * Recursive method comparing start/end indices inward.
 *
 * @author Developer
 * @version 9.0
 *          ==================================================
 */
public class UC9_RecursivePalindrome {
    public static void main(String[] args) {
        String input = "madam";
        boolean result = check(input, 0, input.length() - 1);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return check(s, start + 1, end - 1);
    }
}
