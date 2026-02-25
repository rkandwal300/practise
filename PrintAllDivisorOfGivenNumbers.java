
import java.util.ArrayList;

public class PrintAllDivisorOfGivenNumbers {

    public static void main(String[] args) {
        int number = 36;
        ArrayList<Integer> list = getDivisors(number);
        System.out.println("List: " + list.toString());
    }

    public static ArrayList<Integer> getDivisors(int number) {
        ArrayList<Integer> digits = new ArrayList();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                digits.add(i);
                if (i != number / i) {
                    digits.add(number / i);
                }
            }
        }
        return digits;
    }
}
