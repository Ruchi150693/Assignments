package com.java.assignment.day4;

public class ThisMethod {
	
	public void DefaultMethod()
	{
		
		System.out.println("This is default method");
	}
	
	public void oneParameterMethod(int a)
	{
		
		System.out.println("This is one parameter method");
	}
	
	public void twoParameterMethod(int b, int c)
	{
		this.threeParameterMethod(1, 2, 3);
		this.DefaultMethod();
		this.fourParameterMethod(1, 2, 3, 4);
		this.oneParameterMethod(1);
		System.out.println("This is two parameter method");
	}
	
	public void threeParameterMethod(int d, int e, int f)
	{
		System.out.println("This is three parameter method");
	}
	
	public void fourParameterMethod (int g, int h , int i, int j)
	
	{
		
		System.out.println("This is four parameter method");
	}
	
	public static void main(String[] args) {
		
	ThisMethod tm= new ThisMethod();
	tm.twoParameterMethod(1, 2);
	}

}
