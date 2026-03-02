
public class FibonacciNumbers {

    public static void main(String[] args) {
        int n = 4;
        int fibonacciNumber = fibOp(n);
        System.out.println("Fib Number: " + fibonacciNumber);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibOp(int n) {
        if (n <= 1) {
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int temp = prev1 + prev2;
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}
