package com.java.assignment.day4;

public class ThisConstractor {
	
	public ThisConstractor()
	{
		this(1,2,3,4);
		System.out.println("This is default constrctor");
	}
	
	public ThisConstractor(int a)
	{
		this();
		System.out.println("This is one parameter constructor");
	}
	
	public ThisConstractor(int b, int c) {
	       
		this(1,2,3);
		System.out.println("This is two parameter contructor");
		
	}
	
	public ThisConstractor(int d, int e, int f)
	{
		this(1);
		System.out.println("This is three parameter constructor");
	}

	public ThisConstractor(int g, int h, int i, int j)
	{
		
		System.out.println("This is four parameter constructor");
	}
	
	public static void main(String[] args) {
		
		ThisConstractor tc = new ThisConstractor(1,2);
		
	}
}
