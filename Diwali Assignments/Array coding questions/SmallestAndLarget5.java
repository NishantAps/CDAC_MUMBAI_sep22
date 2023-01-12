import java.lang.*;
import java.util.*;

class SmallestAndLarget5{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements of the array : ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < array.length; i++){
			
			array[i] = sc.nextInt();
			
		}
		
		int small = array[0];
		int large = array[0];
		
		for(int i = 1; i < array.length; i++){
				
			if(array[i] < small){
				
				small = array[i];
				
			}
			
			if(array[i] > large){
				
				large = array[i];
			}
			
		}
		
		System.out.println("Smallest element in the array is : "+small);
		System.out.println("Largest element in the array is : "+large);
	}
}