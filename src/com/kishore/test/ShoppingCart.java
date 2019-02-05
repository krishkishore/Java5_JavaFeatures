package com.kishore.test;

import java.io.Serializable;

public class ShoppingCart implements Serializable {

	int id;
	String name;
	transient String gender;
}
