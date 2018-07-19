package Thirdpackage;

class A1 
{
   private A1()//PRIVATE CONSTRUCTOR. OBJECT CANNOT BE CREATED
   
   	{
	   
   	}
   	public static String dd()
   	{
   		return "new password";
   	}
}

class B
{
	 void display()
	 {
		 System.out.println("A display");
	 }
}
public class A{
	public static void main(String args[])
	{
		System.out.println(A1.dd());
	}
}