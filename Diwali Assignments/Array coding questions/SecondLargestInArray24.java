import java.lang.*;
import java.util.*;

class SecondLargestInArray24{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		int firstMax = a[0];
		
		
		for(int i = 1; i < a.length; i++){
			if(a[i] > firstMax){
				
				firstMax = a[i];
			}
		}
		
		
		int secondMax = a[0];
		
		
		for(int i = 1; i < a.length; i++){
			if(a[i] != firstMax){
				
				if(a[i] > secondMax){
					
					secondMax = a[i];
				}
			}
		}
		
		System.out.println("Second largest element in the array is : "+secondMax);
	
	}
}