public class Pattern9
{
	 public static void main(String args[])
	 {
		for( char i='A'; i<='E'; i++)
		{
			for(char j='E'; j>=i+1; j--)
			{
			System.out.print(" ");
			}
			for(char j='A'; j<=i; j++)
			{
            System.out.print(" "+j);			
			}
				System.out.println();
		}
		   
	 }
 }
 
 /*
 
 OUTPUT
 
     A
    A B
   A B C
  A B C D
 A B C D E  */