package com.java.assignment.day6;

public class ParentClass {

	public ParentClass() {
			
		this(1,2,3);
		System.out.println("Parent Default Constructor");

	}

	public ParentClass(int a) {
		
		this();
		System.out.println("parent one parameterized Constructor");

	}

	public ParentClass(int a ,int b) {
		
		this(1);
		System.out.println("Parent two parameterized Constructor");

	}

	public ParentClass(int a , int b, int c) {

		System.out.println("Parent three parameterized Constructor");

	}
	
	
}
