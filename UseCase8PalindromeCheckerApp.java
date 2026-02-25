import java.util.LinkedList;

/**
 * ==================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ==================================================
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * Uses LinkedList removeFirst/removeLast for
 * symmetric validation.
 *
 * @author Developer
 * @version 8.0
 *          ==================================================
 */
public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        boolean isPalindrome = true;
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
