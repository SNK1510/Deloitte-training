package Thirdpackage;

public class ConstructorChaining 
{
   int customerId;
   String Customername;
   int billamount;
	
	public ConstructorChaining()
	{
		customerId=1111;
		
		billamount=20000;
		Customername="Default name";
	}
	public ConstructorChaining(int customerId,int billamount)
	{
		this.customerId=2222;
		this.billamount=40000;
	}
   public ConstructorChaining(String Customername,int customerId)
   {
	   this();
	   this.Customername="1st parameterized constructor";
	   this.customerId=3333;
	   
   }
   public void display()
   {
	   System.out.println("Customer name:"+Customername);
	   System.out.println("customer id"+customerId);
	   System.out.println("bill amount:"+billamount);
   }
   
  public static void main(String args[])
  {
	  String Customername=null;
	  int customerId=0;
	  ConstructorChaining cust1=new ConstructorChaining();
	 // cust1.display();
	  ConstructorChaining cust2=new ConstructorChaining(Customername,customerId);
	  cust2.display();
  }
}

