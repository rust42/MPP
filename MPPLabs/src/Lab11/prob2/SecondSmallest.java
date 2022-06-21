package Lab11.prob2;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondSmallest {

    public static  <T extends  Number> T findSecondSmallest(T[] numbers) {
        Optional<T> value = Stream.of(numbers)
                .sorted()
                .skip(1)
                .findFirst();
        return value.orElse(null);
    }

    public static void sum(List<? extends  Number> nums) {
        int sum = 0;
        for (Number num: nums) {
            sum += num.intValue();
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(findSecondSmallest(numbers));
    }
}
