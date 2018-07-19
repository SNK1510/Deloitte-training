package Thirdpackage;

class Animal1 
{
	public Animal1()
	{
		System.out.println("This is the animal constructor");
	}
	public void eat()
	{
		System.out.println("Animal food");
	}
}
   class Cat extends Animal1
  {
	  //public class Cat
	 // {
		  public Cat()
		  {
			 System.out.println("This is the Cat constructor");
		  }
		  public void eat()
			{
				System.out.println("Cat food");
			}
		  
	  }
  
   class Dog extends Animal1
   {
	   public Dog()
	   {
		   System.out.println("This is the Dog constructor");
	   }
	   public void eat()
		{
			System.out.println("dog food");
		}
	   public void bark()
	   {
		   System.out.println("barkkkkk");
	   }
   }
   abstract class LearningAbstractclasses
   {
	   public LearningAbstractclasses()
	   {
		   System.out.println("This is the abstract class constructor");
	   }
		   public abstract void displayyourname();
		   public abstract void displayyourage();
	 }
   
   class UseAbstract extends LearningAbstractclasses
   {
	   public UseAbstract()
	   {
		   System.out.println("This is the subclass constructor");
	   }
	   public void displayyourname()
	   {
		   System.out.println("My name is SNK");
	   }
	   public void displayyourage()
	   {
		   System.out.println("21");
	   }
   }
   class LearningInheritance
   {
	   public static void main(String args[]) 
	   {
		  // Animal1  a=new Animal1 ();
	       //Cat c=new Cat();
	       //c.eat();
	      // Animal1  a1=new Cat ();
	       //a1.eat();
	       //a1=new Dog ();
	       //a1.bark();....shows error
	       //Dog d=new Dog();
	       //d.eat();
		  // UseAbstract ua=new UseAbstract();
		   /*LearningAbstractclasses lab=new LearningAbstractclasses() {
			
			@Override
			public void displayyourname() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void displayyourage() {
				// TODO Auto-generated method stub
				
			}
		};*/
		   
		   UseAbstract ua=new UseAbstract();
		   
		   
	   }
}
