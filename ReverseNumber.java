
public class ReverseNumber {

    public static void main(String[] args) {
        int number = -123;
        System.out.println("The number is: " + number);
        int reverseNumber = new ReverseNumber().reverse(number);
        System.out.println("The reverse number is: " + reverseNumber);
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }
}
