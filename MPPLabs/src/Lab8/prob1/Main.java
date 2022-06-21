package Lab8.prob1;


import java.util.Random;
import java.util.function.Supplier;



public class Main {
    // i
    static Supplier<Double> supplier = () -> Math.random(); // or Math::random

    public static void main(String[] args) {
        // ii
        System.out.println(supplier.get());
        RandomNumberGenerator generator =  new Main().new RandomNumberGenerator();
        System.out.println(generator.get());
    }

    /// iii
    class RandomNumberGenerator implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }

}
