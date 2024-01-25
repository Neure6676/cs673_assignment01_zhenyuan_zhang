package Program3_EqualLengthLists;

import java.util.Scanner;

public class checkEqualLength {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get 2 lists
        System.out.println("Please enter the first list in the format '[a,b,c]': ");
        String firstList = scanner.nextLine();
        System.out.println("Please enter the second list in the format '[a,b,c]': ");
        String secondList = scanner.nextLine();

        // process 2 lists to string arrays:
        // 1. remove []
        // 2. split by ,
        String[] list1 = firstList.replaceAll("\\[|\\]", "").split(",");
        String[] list2 = secondList.replaceAll("\\[|\\]", "").split(",");

        // check if valid
        if (list1.length != list2.length) {
            System.out.println("Error: The length of two lists are not equal.");
        } else {
            // build the combination with StringBuilder
            StringBuilder comb = new StringBuilder();
            comb.append("[");
            for (int i = 0; i < list1.length; i++) {
                comb.append(list1[i]);
                comb.append(",");
                comb.append(list2[i]);
                comb.append(",");
            }
            comb.deleteCharAt(comb.length() - 1);
            comb.append("]");
            System.out.println("Combined list: " + comb.toString());
        }
    }
}
