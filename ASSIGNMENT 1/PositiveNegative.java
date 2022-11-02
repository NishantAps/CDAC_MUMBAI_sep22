import java.util.Scanner;
public class PositiveNegative
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");

int b=sc.nextInt();
 if(b>0)
 {
 System.out.println("Positive");
 }
 else if(b<0)
 {
 System.out.print("Negative");
 }
 else
 {
 System.out.print("Neutral");
 }
}
}