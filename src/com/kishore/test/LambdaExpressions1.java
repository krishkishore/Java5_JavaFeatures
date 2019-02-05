package com.kishore.test;

public class LambdaExpressions1 {
	public static void main(String[] args) {

		Drawable d = new Drawable() {
			public String draw(String name) {
				return "krishhh";
			}
		};
		System.out.println(d.draw("krish"));

	}
}
