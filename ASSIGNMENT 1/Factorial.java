import java.util.Scanner;

public class Factorial
{
public static void main(String args[])
 {
    Scanner sc= new Scanner(System.in);
	{
		System.out.println( "Enter the number" );
		System.out.println( "Enter the number" );
		int a=sc.nextInt();
		int b=sc.nextInt();
		for( int i=1; i<=a*b; i++)
		{
			if(a*i==b*i)
			{
				System.out.println(i);
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