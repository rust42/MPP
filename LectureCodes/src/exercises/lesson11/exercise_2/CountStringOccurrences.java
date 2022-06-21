package exercises.lesson11.exercise_2;

public class CountStringOccurrences {
	public static int countOccurrences(String[] arr, String target) {
		int count = 0;
		if (target == null) {
			for (String item : arr) {
				if (item == null) {
					count++;
				}
			}
		} else {
			for (String item : arr) {
				if (target.equals(item)) {
					count++;
				}
			}
		}
		return count;
	}
}
