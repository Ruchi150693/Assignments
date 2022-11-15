//(((((x1+x2)+x3)-x4)*x5)/x6)

package com.java.assignment.day6;

import java.security.PublicKey;
import java.util.Scanner;

public class ScannerClass {

	public int sum(int a1, int b1) {

		int resultsum = a1 + b1;
		System.out.println("Result of sum: "+resultsum);
		return resultsum;

	}

	public int sum1(int a2, int b2) {
		
		int resultsum1=a2+b2;
		System.out.println("Result of sum1: "+resultsum1);
		return resultsum1;

	}

	public int sub(int a3, int b3) {
		
		int resultsub=a3-b3;
		System.out.println("Result of sub: "+resultsub);
		return resultsub;

	}

	public int mul(int a4, int b4) {
		int resultmul=a4*b4;
		System.out.println("Result of mul: "+resultmul);
		return resultmul;
		

	}

	public int div(int a5, int b5) {
		int resultdiv=a5/b5;
		System.out.println("Result of div: "+resultdiv);
		return resultdiv;

	}

	public static void main(String[] args) {
		System.out.println("Enter the value of x1");
		Scanner sc1 = new Scanner(System.in);
		int x1 = sc1.nextInt();

		System.out.println("Enter the value of x2");
		Scanner sc2 = new Scanner(System.in);
		int x2 = sc2.nextInt();

		System.out.println("Enter the value of x3");
		Scanner sc3 = new Scanner(System.in);
		int x3 = sc3.nextInt();

		System.out.println("Enter the value of x4");
		Scanner sc4 = new Scanner(System.in);
		int x4 = sc4.nextInt();

		System.out.println("Enter the value of x5");
		Scanner sc5 = new Scanner(System.in);
		int x5 = sc5.nextInt();

		System.out.println("Enter the value of x6");
		Scanner sc6 = new Scanner(System.in);
		int x6 = sc6.nextInt();

		ScannerClass scannerClass = new ScannerClass();
		int result1=scannerClass.sum(x1, x2);
		int result2=scannerClass.sum1(result1, x3);
		int result3=scannerClass.sub(result2, x4);
		int result4=scannerClass.mul(result3, x5);
		int result5=scannerClass.div(result4, x6);
		System.out.println("Final result is: " +result5);

	}

}
