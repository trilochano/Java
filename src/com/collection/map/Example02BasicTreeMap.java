package com.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class Example02BasicTreeMap {

	public static void main(String[] args) {

		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(104, "Trilochan");
		treeMap.put(105, "Reddy");
		treeMap.put(103, "3lochan");
		treeMap.put(102, "ObulaReddy");
		treeMap.put(101, "ObulaReddy Trilochana Reddy");

		for (Map.Entry<Integer, String> m : treeMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
