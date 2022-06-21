package Lab9.prob9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        printSquares(10);
    }

    private static void printSquares(int num) {
        int counter = 1;

        int[] nums = IntStream.iterate(1, n -> ++n)
                        .map(a -> a * a)
                        .limit(num)
                                        .toArray();

        System.out.println(Arrays.toString(nums));
    }
}
