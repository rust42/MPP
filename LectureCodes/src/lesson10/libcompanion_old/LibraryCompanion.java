package lesson10.libcompanion_old;

public class LibraryCompanion {
	public static String firstToUpper(String word) {
		if(word == null || word.isEmpty()) return word;
		char firstLetter = word.charAt(0);
		return Character.toUpperCase(firstLetter) 
				+ word.substring(1);
	}
}
