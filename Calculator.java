package com.deloittetraining.assessment;

import java.util.Scanner;


  
public class Calculator
{
	public static void main(String args[]) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
		int choice=sc.nextInt();
		Arithmetic[] a=new Arithmetic[4];
		
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		a[0]=new Addition();
		a[1]=new Subtraction();
		a[2]=new Multiplication();
		a[3]=new Division();
		System.out.println("The operation on the number is"+a[choice-1].calculate(num1, num2));
	}
	
}

abstract class Arithmetic
{
	int num1,num2;
	
	
	public abstract int calculate(int num1,int num2);
	
	
}
class Addition extends Arithmetic
{
	
	
	public int calculate(int num1,int num2)
	 {
		int sum=num1+num2;
		return sum;
	 }
}
class Subtraction extends Arithmetic
{
	 
	public int calculate(int num1,int num2)
	 {
		int subtraction=num1-num2;
		return subtraction;
	 }
}
class Multiplication extends Arithmetic
{
	
	public int calculate(int num1,int num2)
	 {
		int product=num1*num2;
		return product;
	 }
}
class Division extends Arithmetic
{
	
	 public int calculate(int num1,int num2)
	 {
		int quotient=num1/num2;
		return quotient;
	 }
}

