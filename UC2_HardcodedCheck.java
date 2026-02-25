/**
 * ==================================================
 * MAIN CLASS - UC2_HardcodedCheck
 * ==================================================
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Description:
 * Checks a hardcoded string using character comparison loop.
 *
 * @author Developer
 * @version 2.0
 *          ==================================================
 */
public class UC2_HardcodedCheck {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
