package Lab8.prob5.b;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class ForEachExample {
	private static void printUpperCased(String str) {
		Function<String, String> f = String::toUpperCase;
		System.out.println(f.apply(str));
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
				"Away", "On Vacation", "Everywhere you want to be");
		list.forEach(ForEachExample::printUpperCased);
	}
}