public class Pattern5

{
	public static void main(String args[])
	{
	  char b;
	  char c; 
	  for(b='A'; b<='E'; b++)
	  {
		  for(c='A'; c<=b; c++)
		  {
		    System.out.print(b);
		  }
		  System.out.println();
	  }
	}
}

/*
OUTPUT

A
BB
CCC
DDDD
EEEEE   */