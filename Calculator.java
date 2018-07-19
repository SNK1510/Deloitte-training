package Thirdpackage;

public class Calculator
	
{
	public void add(int a, int b)
	{
		System.out.println((a+b));
	}
	public void add(double a, double b)
	{
		System.out.println((a+b));
	}
	public void add(int a, double b)
	{
		System.out.println((a+b));
	}
	public void add(double a, int b)
	{
		System.out.println((a+b));
	}
	//diff
	public void diff(int a, int b)
	{
		System.out.println((a-b));
	}
	public void diff(double a, double b)
	{
		System.out.println((a-b));
	}
	public void diff(int a, double b)
	{
		System.out.println((a-b));
	}
	public void diff(double a, int b)
	{
		System.out.println((a-b));
	}
	//mul
	public void mul(int a, int b)
	{
		System.out.println((a*b));
	}
	public void mul(double a, double b)
	{
		System.out.println((a*b));
	}
	public void mul(int a, double b)
	{
		System.out.println((a*b));
	}
	public void mul(double a, int b)
	{
		System.out.println((a*b));
	}
	//div
	public void div(int a, int b)
	{
		System.out.println((a/b));
	}
	public void div(double a, double b)
	{
		System.out.println((a/b));
	}
	public void div(int a, double b)
	{
		System.out.println((a/b));
	}
	public void div(double a, int b)
	{
		System.out.println((a/b));
	}
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		c.add(1,1.5);
		c.mul(1,1.5);
		c.div(1,1.5);
		c.diff(1,1.5);
		
	}
}
	   