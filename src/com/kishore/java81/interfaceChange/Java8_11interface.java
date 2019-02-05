package com.kishore.java81.interfaceChange;

public interface Java8_11interface {

	// Interface Static Method cannot inherit to the Impl classes
	static String interfaceStaticMethod() {
		return "interfaceStaticMethod1";
	}

	String stat1 = interfaceStaticMethod();
	String stat2 = Java8_11interface.interfaceStaticMethod();

	// Interface Default Method can be inherited to the Impl classes
	default String interfaceDefaultMethod() {
		return "interfaceDefautMethod1";
	}

}
