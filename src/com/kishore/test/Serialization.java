package com.kishore.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		ShoppingCart ref = new ShoppingCart();
		ref.id = 10;
		ref.name = "kishore";
		ref.gender = "male";

		try (FileOutputStream fos = new FileOutputStream("D:\\Kishore\\kishore.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(ref);
			oos.flush();
			System.out.println("Object is written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
