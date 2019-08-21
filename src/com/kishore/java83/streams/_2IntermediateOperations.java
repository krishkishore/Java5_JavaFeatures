package com.kishore.java83.streams;

import java.util.List;

public class _2IntermediateOperations {
	public static void main(String[] args) {
		_1Stream ref = new _1Stream();
		List<String> list = ref.returnStringList();
		System.out.println("");

		list.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
		System.out.println(" ");

		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println(" ");

		list.stream().filter(s -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println(" ");

		list.stream().sorted().filter(s -> s.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);
		System.out.println(" ");

	}
}
