package Program1_MultiplicationTable;

public class printMultiplicationTable {

    public static void print() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Table " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {
        print();
    }
}
