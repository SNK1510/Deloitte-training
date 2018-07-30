package com.deloittetraining.assessment;

import java.util.Scanner;

class EmplyeeVo
{
  int empid;
  String empname;
  double annualincome;
   double incometax;
   int $const=10;
  
}
class EmplyeeBo
{
	public void calincomeTax(EmplyeeVo emp)
	{
		if(emp.annualincome>10000)
		{
			emp.incometax=(emp.annualincome*0.2)+emp.annualincome;
		}
	}
}


class Emplyeesort implements Comparator
{
	
}
public class EmplyeeMain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int numberofemployees=sc.nextInt();
		EmplyeeVo[] arrayofemployees=new EmplyeeVo[numberofemployees];
		
		
	}
}