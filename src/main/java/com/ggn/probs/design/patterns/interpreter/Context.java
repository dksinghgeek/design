package com.ggn.probs.design.patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<String, Integer> map = new HashMap<>();

	public void put(String key, int value) {
		map.put(key, value);
	}

	public int get(String key) {
		return map.get(key);
	}
}
