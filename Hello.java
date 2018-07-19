
public class Hello {

	public void display()
	{
		System.out.println("displayyy");
	}
	public void accept()
	{
		System.out.println("Accept");
		Hello hello=new Hello();
		
		hello.display();
		//hello.hi();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloooooo");
		Hello h=new Hello();
		h.display();
		h.accept();
		How how=new How();
		how.hi();
	}

}

class How
{
	public void hi()
	{
		System.out.println("jghjhj");
	}
	//How how=new How();
 public static void main(String[] args)//2 entry points now. You get to choose. 
 {
	System.out.println("second main");
	Employee1 employee1=new Employee1();
	employee1.displayemployee();
}
}


//create object of the class to use display()
//main is not a great method. Only speciality is that jvm calls it.