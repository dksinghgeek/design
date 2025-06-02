package com.ggn.probs.design.patterns.iterator;

import java.util.List;

public interface Aggregator {
	public Iterator createIterator(List<Book> books);
}
