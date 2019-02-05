package com.kishore.java81.interfaceChange;

public class Java8_13interface implements Java8_11interface, Java8_12interface {

	@Override
	public String interfaceDefaultMethod() {
		System.out.println(Java8_11interface.super.interfaceDefaultMethod());
		System.out.println(Java8_12interface.super.interfaceDefaultMethod());
		return "interfaceDefautMethod3\n";
	}

	public static void main(String[] args) {

		// Interface Static Methods Accessing
		System.out.println(Java8_11interface.interfaceStaticMethod());
		System.out.println(stat1);
		System.out.println(stat2 + "\n");

		// Below one impossible becoz Interface Static method can't be inherited
		// System.out.println(Java8_13interface.interfaceStaticMethod());

		// Interface Default Methods Accessing
		// Upcasting
		Java8_11interface ref1 = new Java8_13interface();
		System.out.println(ref1.interfaceDefaultMethod());

		// Object Creation Way
		Java8_13interface ref2 = new Java8_13interface();
		System.out.println(ref2.interfaceDefaultMethod());
	}

}
