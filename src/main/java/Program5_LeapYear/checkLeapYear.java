package Program5_LeapYear;

import java.util.Scanner;

public class checkLeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year:");

        int year = scanner.nextInt();

        if (check(year)) {
            System.out.println("Congratulations! This is a leap year!");
        } else {
            System.out.println("Oops. This is not a leap year.");
        }

    }

    public static boolean check(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
