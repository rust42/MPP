package lesson7.enums3.java7;

import java.time.LocalDate;

public class Book extends DisplayItem {
	private String title;
	public Book(String owner, LocalDate date, String title) {
		super(owner, date);
		this.title = title;
	}
}
