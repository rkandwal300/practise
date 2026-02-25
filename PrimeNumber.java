
public class PrimeNumber {

    public static void main(String[] args) {
        int number = 43;
        boolean isPrime = new PrimeNumber().isPrime(number);
        System.out.println("The number " + number + " is " + (isPrime ? "" : " not ") + "a prime number.");
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
