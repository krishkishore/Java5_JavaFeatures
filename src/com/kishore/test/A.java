package com.kishore.test;

public class A {

	public static void main(String[] args) {
		String ref1 = new String("kishore");
		String ref2 = new String("kishore");
		String ref3 = new String("krish");

		System.out.println(ref1.toString());
		System.out.println(ref2.toString());
		System.out.println(ref3.toString());

		System.out.println(System.identityHashCode(ref1));
		System.out.println(System.identityHashCode(ref2));
		System.out.println(System.identityHashCode(ref3));

		System.out.println(ref1.hashCode());
		System.out.println(ref2.hashCode());
		System.out.println(ref3.hashCode());

		System.out.println(ref1.equals(ref2));
		System.out.println(ref1.equals(ref3));

		System.out.println("----");
		System.out.println(ref1 == ref2);
		System.out.println(ref2 == ref3);

	}
}
