package com.kishore.java81.interfaceChange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8_5ForEach {

	public static void main(String[] args) {

		// 1st Way
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list1.forEach(list -> System.out.print(list));
		System.out.println();

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		// 2nd Way It show how the above one work
		Consumer<Integer> c = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t);
			}
		};
		list2.forEach(c);
		System.out.println();

		// Other different Ways
		Consumer<Integer> c1 = (Integer t) -> System.out.print(t);
		list2.forEach(c1);
		System.out.println();

		// Type is removed because defined in Consumer
		Consumer<Integer> c2 = (t) -> System.out.print(t);
		list2.forEach(c2);
		System.out.println();

		// For one Parameter, parenthesis is not required
		Consumer<Integer> c3 = t -> System.out.print(t);
		list2.forEach(c3);

	}
}
