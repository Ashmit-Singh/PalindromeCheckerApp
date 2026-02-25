/**
 * ==================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==================================================
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Encapsulates palindrome logic in a PalindromeChecker
 * class with checkPalindrome() method (SRP).
 *
 * @author Developer
 * @version 11.0
 *          ==================================================
 */
public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
