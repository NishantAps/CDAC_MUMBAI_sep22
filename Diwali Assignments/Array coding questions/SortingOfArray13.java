import java.lang.*;
import java.util.*;

class SortingOfArray13{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		int temp;
		for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length; j++){
				
				if(a[i] > a[j]){
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		System.out.println("Elements after sorting are : ");
		for(int x : a){
			
			System.out.println(x);
		}
	}
}