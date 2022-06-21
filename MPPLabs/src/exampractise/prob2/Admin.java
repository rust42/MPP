package exampractise.prob2;

import org.w3c.dom.ranges.Range;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {

}

class SeniorTeamLeader extends Employee {

}

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		//implement
		List<String> phoneNums = Arrays.stream(members)
				.filter(member -> {
					return member
							.getCheckoutRecord()
							.getCheckoutEntryList()
							.stream()
							.anyMatch(e -> e.getLendingItem().equals(item));
				})
				.sorted(Comparator.comparing(LibraryMember::getPhone))
				.map(LibraryMember::getPhone)
				.collect(Collectors.toList());

		return phoneNums;
	}

	public static void main(String[] args) {
		List<SeniorTeamLeader> list1 = new ArrayList<>();
//		List<Employee> list2 = list1;

		Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

	}
}



class Product implements Iterable {

	Item[] items = new Item[100];

	 class ProductIterator implements Iterator {
		int counter = 0;

		@Override
		public boolean hasNext() {
			if (counter >= items.length) {
				throw new IndexOutOfBoundsException();
			}
			return true;
		}

		@Override
		public Object next() {
			Item nextValue = items[counter];
			counter += 1;
			return nextValue;
		}
	}

	@Override
	public Iterator iterator() {
		return new ProductIterator();
	}

	static class Item {}


}