package Lab9.prob10.B;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = List.of("Bill", "Thomas", "Mary");

        String joined = list.stream()
                .reduce("", (a, b) -> {
                    if (a.isEmpty()) {
                        return b;
                    }
                return b + "," + a;
                });
        System.out.println(joined);
    }
}
