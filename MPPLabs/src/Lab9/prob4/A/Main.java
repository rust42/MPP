package Lab9.prob4.A;

import java.util.stream.Stream;

public class Main {
    static final private Stream<Integer> primes = Stream.iterate(2, n -> {
        do {
            n = n + 1;
        } while (!isPrimeNumber(n));
        return n;
    });

    public static void main(String[] args) {
        primes.limit(10).forEach(System.out::println);
    }


    static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
