package Lab9.prob4.B;

import java.util.stream.Stream;

public class PrimeStream {
    private Stream<Integer> makeStream() {
         return Stream.iterate(2, n -> {
            do {
                n = n + 1;
            } while (!isPrimeNumber(n));
            return n;
        });
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printFirstNPrimes(int n) {
        makeStream()
                .limit(n)
                .forEach(System.out::println);
    }
}
