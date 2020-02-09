package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Example01BasicHashMap {

	public static void main(String[] args) {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(104, "Trilochan");
		hashmap.put(105, "Reddy");
		hashmap.put(103, "3lochan");
		hashmap.put(102, "ObulaReddy");
		hashmap.put(101, "ObulaReddy Trilochana Reddy");
		// System.out.println(hashmap);

		for (Map.Entry<Integer, String> m : hashmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
