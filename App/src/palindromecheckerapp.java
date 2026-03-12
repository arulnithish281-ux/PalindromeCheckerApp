import java.util.Scanner;

public class palindromecheckerapp {


    public class PalindromeChecker {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();

            int i = 0;
            int l = a.length();
            boolean flag = true;

            while (i < l / 2) {
                if (a.charAt(i) != a.charAt(l - i - 1)) {
                    flag = false;
                    break;
                }
                i++;
            }

            if (flag)
                System.out.println("Is a Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
    }
}
