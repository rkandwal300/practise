
public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        boolean isArmstrongNumber = isArmstrong(number);
        System.out.println("The number is " + (isArmstrongNumber ? "" : " not ") + "a Armstrong number.");
    }

    public static boolean isArmstrong(int N) {
        int armstrong = 0;
        int number = N;
        int length = 0;
        while (number != 0) {
            length++;
            number /= 10;
        }
        number = N;
        while (number != 0) {
            int digit = number % 10;
            armstrong += (int) Math.pow(digit, length);
            number /= 10;
        }
        return armstrong == N;
    }
}
