package com.kishore.java7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Java7_4TryWithResource {
	public static void main(String[] args) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("/java7-new-features/src/abc.txt");
				InputStream input = new FileInputStream("/java7-new-features/src/abc.txt")) {
		} catch (Exception e) {
		}

	}
}
