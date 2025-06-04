package com.ggn.probs.design.patterns.ecom;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CartRepository {
	private Map<UUID, CartManager> repo = new HashMap<>();
	
	public void add(UUID id, CartManager cart){
		repo.put(id, cart);
	}
	
	public CartManager get(UUID id) {
		return repo.get(id);
	}
}
