
public class Ampersandexample
{
  public static void main(String args[])
  {
	  int i=0;
	  int j=2;
	  boolean b=(i>j)&&(j++>i);
	  System.out.println(j);
  
  boolean b1=(i>j)&(j++>i);
  
  System.out.println(j);
}
}

