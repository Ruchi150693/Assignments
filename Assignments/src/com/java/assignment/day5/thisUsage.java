package com.java.assignment.day5;

public class thisUsage {
	
	int a=2; //global variable
	
	public void dispaly(int a) //local variable
	{
		//a=a;  0
		this.a=a; // 1
		//System.out.println("Value of a is :"+a );
		
	}

	public static void main(String[] args) {
		thisUsage tu = new thisUsage();
		tu.dispaly(1);
		System.out.println("Value of a is :"+tu.a );
		
	}
}

