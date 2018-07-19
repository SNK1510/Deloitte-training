package Thirdpackage;

public class Implementingfunctions //extends Usingvariables
{
	int sum;
	public int calculatesum(int a,int b)
	{
		Usingvariables uv= new Usingvariables();
		uv.mainvariable=a+b;
		System.out.println(uv.mainvariable);
		return uv.mainvariable;
	}
	
	public static void main(String args[])
	{
		Implementingfunctions f1=new Implementingfunctions();
		int value=f1.calculatesum(10, 20);
		//value+=f1.calculatesum(10, 20);
		
		
		//value+=f1.calculatesum(10, 20);
		System.out.println(value);
	}

}
