package com.kishore.java82.functionalinterface;

public class A2 {

	public static void main(String[] args) {

		A1 ref = (message) -> System.out.println(message);
		ref.sayMessage("Kishore");

	}
}
