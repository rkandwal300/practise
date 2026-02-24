
public class Palindrome {

    public static void main(String[] args) {
        int number = -123;
        System.out.println("The number is: " + number);
        boolean isPalindrome = new Palindrome().isPalindrome(number);
        System.out.println("The reverse number is: " + isPalindrome);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int number = x;
        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return false;
            }
            rev = rev * 10 + digit;
            number /= 10;
        }
        return x == rev;
    }
}
