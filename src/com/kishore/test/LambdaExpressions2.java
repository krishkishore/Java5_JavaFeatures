package com.kishore.test;

public class LambdaExpressions2 {
	public static void main(String[] args) {

		Drawable d = (name) -> {
			return "Hello";
		};

		System.out.println(d.draw("kishore"));

	}
}
