package Thirdpackage;

public class Calculate 
{
	float f;
 public Calculate(float temperature,char scale) 
 {
	 printmymessage(temperature,scale);
 }
 public String printmymessage(float temperature,char scale)
 {
	
	 switch(scale)
	  {
	  case 'c':
	  case 'C':break;
	  case 'F':
	  case 'f': f=convert(temperature);
	  break;
	  default:System.out.println("Wrong scale!");
	  }
	  if(f>60 ||f<(-10)) 
	  {
		 return "Be careful!";
	  }
	  else
		  
	  {
		  return "You are safe";
	  }
	  return null;
 }
	
 
 public float convert(float temperature)
 {
	 temperature=(5*(temperature-32)/19);
	 return temperature;
 }
}
