package com.kishore.test;

public class A1 {

	public static void main(String[] args) {

		int a = 1, b = 0, c;

		try {
			System.out.println("1");
			c = a / b;
			System.out.println("2");
		} catch (ArithmeticException e) {
			System.out.println("3");
			e.printStackTrace();
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
}
