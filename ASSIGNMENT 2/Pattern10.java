public class Pattern10
{
	 public static void main(String args[])
	 {
		for( char i='A'; i<='E'; i++)
		{
			for(char j='E'; j>=i+1; j--)
			{
			System.out.print(" ");
			}
			for(char j='E'; j<=i; j++)
			{
            System.out.print(" "+j);			
			}
				System.out.println();
		}
		   
	 }
 }