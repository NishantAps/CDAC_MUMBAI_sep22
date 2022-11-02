public class Pattern13
{
public static void main(String args[])
	{
	  char b;
	  char c; 
	  for(b='A'; b<='E'; b++)
	  {
		  for(c='E'; c>=b; c--)
		  {
			  System.out.print(" ");
		  }
		 for(c='A'; c<=b; c++)
		  {
		    System.out.print(" "+b);
		  }
		  System.out.println();
	  }
	}
}
	
/*	
	 OUTPUT
	 
	  A
     B B
    C C C
   D D D D
  E E E E E
	             */