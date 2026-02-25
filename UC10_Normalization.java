/**
 * ==================================================
 * MAIN CLASS - UC10_Normalization
 * ==================================================
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * Normalizes input (remove non-alphanumeric, lowercase)
 * then compares from both ends.
 *
 * @author Developer
 * @version 10.0
 *          ==================================================
 */
public class UC10_Normalization {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
