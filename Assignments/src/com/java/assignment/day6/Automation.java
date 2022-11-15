package com.java.assignment.day6;

public class Automation {

	String name;
	public void m() {
		this.m3(1, 2, 3);
		System.out.println("Parent default method");
	}

	public void m1(int a) {
		this.m();
		System.out.println("Parent one parameterized method");

	}

	public void m2(int a, int b) {
		this.m1(1);
		System.out.println("Parent two parameterized method");

	}

	public void m3(int a, int b, int c) {
		System.out.println("Parent three parameterized method");

	}

}
