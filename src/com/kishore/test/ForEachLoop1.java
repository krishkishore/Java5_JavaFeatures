package com.kishore.test;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop1 {
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}

		list1.forEach(data -> System.out.println(data));
		System.out.println("-------------");

	}
}