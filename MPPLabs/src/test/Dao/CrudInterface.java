package test.Dao;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CrudInterface {

    public <T extends  Comparator<T>> T findSecondSmallest(T[] numbers) {
        Optional<T> value = List.of(numbers).stream().sorted()
                .skip(1)
                .findFirst();
        return value.orElse(null);
    }

}
