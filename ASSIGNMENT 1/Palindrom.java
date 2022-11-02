import java.util.Scanner;
public class Palindrom
{
public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the number");
      int a= sc.nextInt();
	  int b,c= 0;
	  int num=0;
	  num=a;
	  while(a>0)
	  {
		  b=a%10;
		  c=(c*10)+b;
		  a=a/10;
	  }
		if(num==c)
		{
			System.out.println("Thn number is palindrom");
		}
		  else
		  {
			  System.out.println("The number is not palindrom");
		  }
		  
	  }
   
 }
 
 /*
 OUTPUT
 
 Enter the number
2120212
Thn number is palindrom

*/