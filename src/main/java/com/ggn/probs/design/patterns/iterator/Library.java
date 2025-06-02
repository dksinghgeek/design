package com.ggn.probs.design.patterns.iterator;

import java.util.List;

public class Library implements Aggregator {

	@Override
	public Iterator createIterator(List<Book> books) {
		return new BookIterator(books);
	}

}
