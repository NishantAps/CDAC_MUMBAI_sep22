import java.util.Scanner;

public class Factors
{
public static void main(String args[])
 {
    Scanner sc= new Scanner(System.in);
	{
		System.out.println( "Enter the number" );
	}
		
		int a= sc.nextInt();
		int x;
		
		for( int i=a; i>=1; i-- )
		
	    if(x=a*(a-i))
		{
			System.out.println(x);
		}
		}	
   }
}
/* 
output:
20

1
2
4
5
10
20 */ 