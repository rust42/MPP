package Lab9.prob10.C;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntSummaryStatistics stats = Stream.of(10, 3, 1, 29, 26, 17)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());






    }
}
