package com.kishore.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("D:\\Kishore\\kishore.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			try {
				Object obj = ois.readObject();
				System.out.println(obj);

				ShoppingCart sc = (ShoppingCart) obj;
				System.out.println(sc);
				System.out.println(sc.id);
				System.out.println(sc.name);
				System.out.println(sc.gender);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
