
public class LngpalSub {

    // Method to check if substring s[left..right] is a palindrome
    private boolean isPalindrome(String s, int left, int right) {
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right))
            return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    // Recursive method to find the longest palindromic substring
    private String longestPalindromeHelper(String s, int start, int end) {
        if (start > end)
            return "";

        if (isPalindrome(s, start, end)) {
            return s.substring(start, end + 1);
        }

        String left = longestPalindromeHelper(s, start + 1, end);
        String right = longestPalindromeHelper(s, start, end - 1);

        return left.length() > right.length() ? left : right;
    }

    // Main method called from outside
    public String longestPalindrome(String s) {
        return longestPalindromeHelper(s, 0, s.length() - 1);
    }

    // Main method to test the code
    public static void main(String[] args) {
        LngpalSub lps = new LngpalSub();

        String input = "babad";
        String result = lps.longestPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}
