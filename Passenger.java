package Thirdpackage;

public class Passenger 
	{
	int pnr;
	String name;
	int fare;
	
		public Passenger(int pnr,String name,int fare)
		{
			this.pnr=pnr;
			this.name=name;
			this.fare=fare;
			
		}
		public boolean equals(Passenger passenger3)
		{
			        if ((this.pnr==pnr)&&(this.name==name)&&(this.fare==fare)) 
			        {
			            return true;
			            }
			        return false;
			     }0

	}
