package Lab9.prob11.B;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Predicate<Employee>, Comparator<Employee>, String>
            nameFunction = (list, predicate, comparator) -> list.stream()
            .filter(predicate)
            .sorted(comparator)
            .map(e -> e.getFirstName() + " " + e.getLastName())
            .reduce("", (acc, name) -> acc.isEmpty() ? name : acc + ", " + name);
}
