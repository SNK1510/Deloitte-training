package Thirdpackage;

public class PassengerMain {
	public static void main(String args[])
	{
		Passenger passenger1=new Passenger(1927,"Yamini",25);
		Passenger passenger2=new Passenger(1927,"Yamini",25);
		Passenger passenger3=passenger1;
		System.out.println(passenger2.equals(passenger3));
	}

}
