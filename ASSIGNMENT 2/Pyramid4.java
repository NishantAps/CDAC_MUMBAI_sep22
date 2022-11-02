import java.util.Scanner;
class Pyramid4
{
	public static void main(String args[])
	{
	  for(int i=1; i<=9; i++)
	    {
			for(int j=8; j>=i; j--)
			{
				System.out.print(" ");
			}
		  for(int j=1; j<=i-1; j++)
		    {
			  System.out.print(j );
		    }
			for(int j=i; j>=1; j--)
		  {
			  System.out.print(j );
		  }
		  System.out.println();
		}
	}
}

/*
OUTPUT

        1
       121
      12321
     1234321
    123454321
   12345654321
  1234567654321
 123456787654321
12345678987654321     */