package com.kishore.java7;

import java.util.ArrayList;
import java.util.List;

public class Java7_5DiamondOperator {
	public static void main(String[] args) {

		// List<Integer> list = new ArrayList<Integer>(); (Previously)
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);

		for (Integer element : list) {
			System.out.println(element);
		}

	}
}
