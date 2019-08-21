package com.kishore.java83.streams;

import java.util.ArrayList;
import java.util.List;

public class _1Stream {

	public List<Integer> returnIntegerList() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		return list;
	}

	public List<String> returnStringList() {
		List<String> list = new ArrayList<>();
		list.add("Amitabh");
		list.add("Shekhar");
		list.add("Aman");
		list.add("Rahul");
		list.add("Shahrukh");
		list.add("Salman");
		list.add("Yana");
		list.add("Lokesh");
		System.out.print(list);
		return list;
	}

}
