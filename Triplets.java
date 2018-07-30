package com.deloittetraining.assessment;

import java.util.Scanner;

public class Triplets 
{
  public static void main(String args[])
  {
	  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int number=sc.nextInt();
	int[] a;
	a=new int[20];
	for(int i=0;i<number;i++)
	{
		System.out.println("Enter element:"+(i+1));
		a[i]=sc.nextInt();
		
	}
	Boolean result=UserMainCode.checkTriplets(a,number);
	if(result==true)
	{
		System.out.println("The triplets exist!!!");
	}
	else 
		System.out.println("Triplets don't exist");
	
	
}
static class UserMainCode
{
	public static boolean checkTriplets(int[] a,int number)
	{
		int count=0;
		int position=0;
		for(int i=0;i<number;i++)
		{
			if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))
			{
				count++;
				
			}
		}
		if(count>0)
		{
			return true;
		}
		else return false;
	}
}
}
