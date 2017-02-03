package com.jgalante.classloader;

public class ClassA implements InterfaceClass {

	@Override
	public String message() {
		return "class-loader-test-two : " + new Util().utilMessage();
	}

}
