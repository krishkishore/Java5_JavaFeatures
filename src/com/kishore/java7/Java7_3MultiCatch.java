package com.kishore.java7;

public class Java7_3MultiCatch {

	public static void main(String[] args) {

		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
