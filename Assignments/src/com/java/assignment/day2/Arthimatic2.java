package com.java.assignment.day2;

//(((((10*2)+2)-2)-2)/2)

public class Arthimatic2 {
	
public int mul (int a, int b) {
		
		int c;
		c=a*b;
		System.out.println("Result of bracket1 :" +c);
		return c;
		
		
	}
	
	public int sum(int d,int e)
	{
		int f;
		f = d+e;
		System.out.println("Result of bracket2 :" +f);
		return f;
		
	}
	
	public int sub(int g,int h)
	{
		int i;
		i=g-h;
		System.out.println("Result of bracket3 :" +i);
		return i;
		
	}
	public int sub1(int j,int k)
	{
		int l;
		l = j-k;
		System.out.println("Result of bracket4 :" +l);
		return l;
		
	}
	public int div(int m,int n)
	{
		int o;
		o = m/n;
		System.out.println("Result of bracket5 :" +o);
		return o;
		
	}
	
	public static void main(String[] args) {
		
		Arthimatic2 ar1 = new Arthimatic2();
		int result1=ar1.mul(10, 2);
		int result2=ar1.sum(result1, 2);
		int result3=ar1.sub(result2,2);
		int result4=ar1.sub1(result3,2);
		int result5=ar1.div(result4,2);
		
		System.out.println("The final result is :"+result5);
	}

}
