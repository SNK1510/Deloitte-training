package Thirdpackage;
import java.util.*;

public class Weathersystem 
{
	
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  //System.out.println("Enter the number of cities:");
	 // int number=sc.nextInt();
	 /// float[] temperatures= new float[20];
	  //char[] scale=new char[20];
	 System.out.println("Temperatures:");
	 float temperature=sc.nextFloat();
	 System.out.println("c or f? ");
	 char scale=sc.next().charAt(0);
	  /*for(int i=0;i<number;i++)
	  { 
		  System.out.println("Enter temperature "+i);
		  temperatures[i]=sc.nextFloat();
		  System.out.println("c or f? "+i);
		  scale[i]=sc.next().charAt(0);
	  }*/
	  
	 Calculate c=new Calculate(temperature,scale);
	 
	 
}
}