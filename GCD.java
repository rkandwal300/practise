
public class GCD {

    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println("The brute force GCD: " + bruteForce(a, b));
        System.out.println("The Euclidean GCD: " + euclidean(a, b));
        System.out.println("The Euclidean Modulo GCD: " + euclideanModulo(a, b));
    }

    public static int bruteForce(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static int euclidean(int a, int b) {
        int maxValue = Math.max(a, b);
        int minValue = Math.min(a, b);
        int eucValue = maxValue - minValue;

        if (eucValue == 0) {
            return minValue;
        }
        return euclidean(minValue, eucValue);
    }

    public static int euclideanModulo(int a, int b) {

        if (b == 0) {
            return a;
        }
        return euclidean(b, a % b);
    }
}
