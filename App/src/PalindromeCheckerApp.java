public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC3 - Palindrome Check Using String Reverse
        String original = "level";  // You can change this string to test
        String reversed = "";

        // Reverse the string using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
    }
}