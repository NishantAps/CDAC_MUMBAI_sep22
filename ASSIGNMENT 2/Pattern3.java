public class Pattern3
{
	 public static void main(String args[])
	 {
		for( char i='A'; i<='E'; i++)
		{
			for(char j='E'; j<='A'; j--)
			{
			System.out.print(" ");
			}
			for(char j='A'; j<=i; j++)
			{
			System.out.print("*"+" ");	
			}
				System.out.println();
		}
		   
	 }
 }
 
 /*
 OUTPUT
 
*
* *
* * *
* * * *
* * * * *
            */