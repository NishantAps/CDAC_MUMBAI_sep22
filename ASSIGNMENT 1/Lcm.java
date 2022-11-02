import java.util.Scanner;
public class Lcm
{
   public static void main(String args[])
   {
      int a, b, c, x, y = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number :");
      a = sc.nextInt();
      System.out.println("Enter second number :");
      b = sc.nextInt();

      if(a > b)
	  {
         c = x = a;
      }
      else{
         c = x = b;
      }

      while(a!= 0) 
	  {
         if(c % a == 0 && c % b == 0) 
		 {
            y = c;
            break;
         }
         c += x;
      }
      System.out.println("LCM of given numbers is: "+y);
   }
}