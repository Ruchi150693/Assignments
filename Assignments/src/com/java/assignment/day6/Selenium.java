package com.java.assignment.day6;

public class Selenium extends Automation {

	public void s() {

		this.s2(1,2);
		System.out.println("Child default method");
	}

	public void s1(int a) {
		
		super.name="Ruchi";
		System.out.println("Name: "+super.name);
		super.m2(1,2);
		System.out.println("Child one parameterized method");
	}

	public void s2(int a, int b) {
		
		this.s3(1,2,3);
		System.out.println("Child two parameterized method");
	}

	public void s3(int a, int b, int c) {
		this.s1(1);
		System.out.println("Child three parameterized method");
	}
	
	public static void main(String[] args) {
		Selenium selenium=new Selenium();
		selenium.s();
	}
}

//Parent 3 parameterized method
//Parent Default method
//Parent 1 parameterized method
//Parent 2 parameterized method
//Child 1 parameterized method
//Child 3 parameterized method 
//Child 2 parameterized method  
//Child default method