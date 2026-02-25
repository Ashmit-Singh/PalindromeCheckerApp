/**
 * ==================================================
 * MAIN CLASS - UC3_StringReverse
 * ==================================================
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * Reverses string with loop + concatenation,
 * compares with equals().
 *
 * @author Developer
 * @version 3.0
 *          ==================================================
 */
public class UC3_StringReverse {
    public static void main(String[] args) {
        String input = "racecar";
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPalindrome = input.equals(reversed);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
