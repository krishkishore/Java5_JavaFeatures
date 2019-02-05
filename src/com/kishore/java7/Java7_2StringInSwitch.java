package com.kishore.java7;

public class Java7_2StringInSwitch {
	public static void main(String[] args) {

		String game = "Cricket";

		switch (game) {
		case "Hockey":
			System.out.println("Let's play Hockey");
			break;
		case "Cricket":
			System.out.println("Let's play Cricket");
			break;
		case "Football":
			System.out.println("Let's play Football");
			break;
		default:
			System.out.println("Default Case");
		}

	}
}
