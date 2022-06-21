package prob2;

import helperclasses.Book;
import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;


/*
 * Print to the console the list of book titles � in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length 
 * of the title (number of characters), then by alphabetical order.  
 */
public class Problem2 {

	public static void main(String[] args) {
		//use this list

		Comparator<Book> length = Comparator.comparing((e) -> e.getTitle().length());
		Comparator<Book> title = Comparator.comparing(e -> e.getTitle());

		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		list.stream()
//				.filter(entry -> entry.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(entry -> entry.getCopy().getBook())
				.sorted(length.thenComparing(title))
				.map(Book::getTitle)
				.forEach(System.out::println);
	}
	

}
