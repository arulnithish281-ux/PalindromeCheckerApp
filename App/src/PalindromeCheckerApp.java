public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC2 - Hardcoded Palindrome Check
        String a = "madam";
        char[] b = a.toCharArray();
        int l = a.length();
        boolean flag = true;

        for (int i = 0; i < l / 2; i++) {
            if (b[i] != b[l - i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("String is Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}