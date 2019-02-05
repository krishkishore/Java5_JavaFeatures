package com.kishore.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachLoop2 {

	public static void main(String[] args) {
		ForEachLoop2 ref = new ForEachLoop2();

		List<Integer> list = new ArrayList<>();
		for (int i = 9; i > 0; i--) {
			list.add(i);
		}

		list.forEach(data -> System.out.println(data));
		System.out.println("-------------");

		ref.sortUsingJava8(list);
		System.out.println(list);

	}

	private void sortUsingJava8(List<Integer> list2) {
		Collections.sort(list2, (s1, s2) -> s1.compareTo(s2));
	}
}
