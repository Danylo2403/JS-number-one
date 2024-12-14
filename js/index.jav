import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {
    // Оптимізований метод для перевірки, чи є число простим
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Перевірка на дільники лише до квадратного кореня числа
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Метод для знаходження простих чисел в масиві
    public static List<Integer> findPrimes(int[] numbers) {
        List<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    // Основний метод для тестування
    public static void main(String[] args) {
        int[] numbers = {29, 15, 3, 4, 19, 18, 7, 25, 99, 1, 2, 16, 17};
        List<Integer> primes = findPrimes(numbers);
        System.out.println("Прості числа: " + primes);
    }
}
