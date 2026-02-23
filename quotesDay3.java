public class Day4 {

    // Is number even?
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Sum of digits
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Reverse a number
    static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // Is prime?
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Is Armstrong?
    static boolean isArmstrong(int n) {
        int original = n, sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {

        // Now using all functions cleanly:
        System.out.println("Is 7 prime? " + isPrime(7));        // true
        System.out.println("Is 10 prime? " + isPrime(10));      // false
        System.out.println("Factorial of 6: " + factorial(6));  // 720
        System.out.println("Reverse of 1234: " + reverse(1234));// 4321
        System.out.println("Sum of digits 9875: " + sumOfDigits(9875)); // 29
        System.out.println("Is 153 Armstrong? " + isArmstrong(153)); // true

        // Print all primes from 1-50 — now ONE clean line:
        System.out.print("Primes: ");
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }

        // Print all Armstrong numbers 1-999 — now ONE clean line:
        System.out.print("\nArmstrong: ");
        for (int i = 1; i <= 999; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
    }
}