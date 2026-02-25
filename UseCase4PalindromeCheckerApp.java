/**
 * ==================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ==================================================
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * Converts to char[], uses two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 *          ==================================================
 */
public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] chars = input.toCharArray();
        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
