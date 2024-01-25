package Program2_Palindrome;

import java.util.Scanner;

public class checkPalindrome {

    public static void main(String[] args) {

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a string: (enter 'q' to quit)");

            String s = scanner.nextLine();

            if (s.equals("q")) {
                return;
            }

            if (isPalindrome(s)) {
                System.out.println("The string " + s + " is a palindrome.");
            } else {
                System.out.println("The string " + s + " is not a palindrome.");
            }
            System.out.println("-----------------------------------------");
        } while (true);

    }

    // check if the string s is a palindrome
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0, r = n - 1;
        while (l < n) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
