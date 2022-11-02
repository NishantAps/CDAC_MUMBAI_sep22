public class Pattern2

{
	public static void main(String args[])
	{
	  char b;
	  char c; 
	  for(b='A'; b<='E'; b++)
	  {
		  for(c='A'; c<=b; c++)
		  {
		    System.out.print(c);
		  }
		  System.out.println();
	  }
	}
}

/*
 OUTPUT

A
AB
ABC
ABCD
ABCDE */