package com.kishore.java82.functionalinterface;

import java.util.ArrayList;

public class MethodReference {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(5);

		al.forEach(i -> System.out.println(i));
		al.forEach(System.out::println);
	}
}
