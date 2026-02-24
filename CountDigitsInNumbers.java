
import java.util.Scanner;

public class CountDigitsInNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = sc.nextInt();
        int numberOfDigitsManual = getTotalCountInDigitsManual(Math.abs(number));
        int numberOfDigits = getTotalCountInDigits(number);
        System.out.println("Total digits were: " + numberOfDigits);
    }

    public static int getTotalCountInDigitsManual(int number) {
        int digits = 1;
        if (number < 10) {
            return digits;
        }
        while (number >= 10) {
            number = number / 10;
            digits++;
        }
        return digits;
    }

    public static int getTotalCountInDigits(int number) {
        return (int) Math.log10(Math.abs(number)) + 1;
    }
}
