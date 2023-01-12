import java.lang.*;
import java.util.*;

class AscendingDescendingOrder10{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		int small = a[0];
		for(int i = 1; i < a.length; i++){
			
			if(a[i] < small){
				
				small = a[i];
			}
			
		}
		
		
		if(small == a[0]){
			
			System.out.println("Array elements are in ascending order");
			
		}
		
		else if(small == a[n-1]){
			
			System.out.println("Array elements are in descending order");
			
		}
		else{
			
			System.out.println("Array elements are in random order");
		}
	}
}