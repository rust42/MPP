package Lab8.prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> words = List.of("carsaw", "dogsawd", "apple", "banana", "dentsa", "calculous", "aztecs", "sau Paolo");
        Main main = new Main();
        System.out.println(main.countWords(words, 'c', 'd', 6));
    }

    public int countWords(List<String> words, char c, char d, int len) {
    return filterDoesNotContainsCharacter(
                filterContainsCharacter(
                        filterHasLength(words, len),
                        c
                ), d
        ).size();
    }

    public List<String> filterHasLength(List<String> list, int len) {
        return list.stream()
                .filter( word -> word.length() == len)
                .collect(Collectors.toList());
    }

    public List<String> filterContainsCharacter(List<String> list, char c) {
        return list.stream()
                    .filter( word -> word.contains(String.valueOf(c)))
                    .collect(Collectors.toList());
    }

    public List<String> filterDoesNotContainsCharacter(List<String> list, char d) {
        return list.stream()
                .filter( word -> !word.contains(String.valueOf(d)))
                .collect(Collectors.toList());
    }
}
