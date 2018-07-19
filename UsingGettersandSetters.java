package Thirdpackage;

public class UsingGettersandSetters 
{
	 public static void main(String args[])
	 {
		 GettersandSetters gs= new GettersandSetters();
		 UsingGettersandSetters ugs=new UsingGettersandSetters();
		 String name=gs.getCustomerName();
		 ugs.printingmethod(name); // Static,so you don't have to call it via an object ref
	 }

	private  void printingmethod(String name) {
		System.out.println(name+name);
		 System.out.println(name+name);
	}
}
