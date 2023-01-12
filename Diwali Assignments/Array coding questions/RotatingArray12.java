import java.lang.*;
import java.util.*;

class RotatingArray12{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < array.length; i++){
			
			array[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter the number by which you want to rotate the array elements to right : ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++){
			
			int last = array[n-1];
			
			for(int j = array.length-1; j--){
				
				array[j] = array[j-1];
			}
			
			array[0] = last;
		}
		
		System.out.println("Elements after right rotation are : ");
		for(int y : array){
			
			System.out.print(y+" ");
		}
		System.out.println();
		System.out.println("Enter the number by which you want to rotate the array elements to left : ");
		int x1 = sc.nextInt();
		
		for(int i = 1; i <= x1; i++){
			
			int start = array[0];
			int j;
			for(j = 0; j < array.length-1; j++){
				
				array[j] = array[j+1];
				
			}
			array[j] = start;
		}
		
		System.out.println("Elements after left rotation are : ");
		for(int z : array){
			
			System.out.print(z+" ");
		}
	}
}