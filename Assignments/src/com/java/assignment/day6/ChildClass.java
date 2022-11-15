package com.java.assignment.day6;

public class ChildClass extends ParentClass {

	public ChildClass() {
		
		this(1,2);
		System.out.println("Child default constructor");
	}

	public ChildClass(int a) {
		
		this();
		System.out.println("Child one parameterized constructor");
	}

	public ChildClass(int a, int b) {
	
		super(1,2);
		System.out.println("Child two parameterized constructor");
	}

	public ChildClass(int a, int b, int c) {
		
		this(1);
		System.out.println("Child three parameterized constructor");
	}
	
	public static void main(String[] args) {
		{
			ChildClass cClass = new ChildClass(1,2,3);
		}
	}
}

//parent 3 parameterized constructor
//parent default constructor
//parent 1 parameterized constructor
//parent 2 parameterized constructor
//child 2 parameterized constructor   
//child default constructor                
//child 1 parameterized constructor  
//child 3 parameterized constructor  