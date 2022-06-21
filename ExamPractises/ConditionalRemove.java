import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConditionalRemove {

    static class  StrLengthCondition implements Predicate<String> {
        @Override
        public boolean test(String s) {
            return s.length() == 5;
        }
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>() {
            {
                add("Hello"); add("Goodbye"); add("somek");
            }
        };
        System.out.println(conditionalRemove(list, e -> e.contains("k")));

        ArrayList<Integer> numbers = new ArrayList<>() {
            {
                add(20); add(5); add(2);
            }
        };
        System.out.println(conditionalRemove(numbers, e -> e > 10));
        System.out.println(list);
    }

    public static <T> List<? extends T> conditionalRemove(List<? extends T> list, Predicate<? super T> predicate) {
        return list.stream()
                .filter(e -> predicate.test(e))
                .collect(Collectors.toList());
//        ArrayList<T> toRemove = new ArrayList<>();

//        for (T s: list) {
//            if (predicate.test(s)) {
//                toRemove.add(s);
//            }
//        }
//        list.remove()
//        return list;
    }
}


