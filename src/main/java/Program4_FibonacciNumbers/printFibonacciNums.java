package Program5_FibonacciNumbers;

import java.math.BigInteger;

public class printFibonacciNums {

    public static BigInteger[] dp;

    public static void print() {
        getFibProcess(100);
        int count = 0;
        System.out.println("The first 100 Fibonacci numbers are:");
        while (count < 100) {
            System.out.println(count + 1 + ". " + dp[count++]);
        }
    }

    public static void getFibProcess(int n) {
        dp = new BigInteger[n + 1];
        dp[0] = dp[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
    }

    public static void main(String[] args) {
        print();
    }
}
