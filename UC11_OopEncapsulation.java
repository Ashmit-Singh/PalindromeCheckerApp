/**
 * ==================================================
 * MAIN CLASS - UC11_OopEncapsulation
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
public class UC11_OopEncapsulation {
    public static void main(String[] args) {
        String input = "racecar";
        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

class PalindromeService {
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
