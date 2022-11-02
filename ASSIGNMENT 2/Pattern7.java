import java.util.Scanner;
class Pattern7
{
	public static void main(String args[])
	{
	  for(int i=1; i<=5; i++)
	    {
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
		  for(int j=5; j<=i; j++)
		    {
			  System.out.print(j+" ");
		    }
		  System.out.println();
		}
	}
}

/*

OUTPUT

     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5