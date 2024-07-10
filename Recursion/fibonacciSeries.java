package Recursion;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Check(n));
    }

    public static int Check(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int fib1 = Check(n - 1);
        int fib2 = Check(n - 2);
        
        return fib1 + fib2;
    }
}
