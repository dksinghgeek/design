package com.ggn.probs.design.patterns.iterator;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book(1, "Alex", "Robert"), new Book(2, "Devid", "Devid"));
		Aggregator lib = new Library();
		Iterator it = lib.createIterator(books);

		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println("Name: " + book.getName());

		}
	}

}
