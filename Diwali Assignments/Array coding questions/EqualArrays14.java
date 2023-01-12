import java.lang.*;
import java.util.*;

class EqualArrays14{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in the array 1 : ");
		int n1 = sc.nextInt();
		
		int a[] = new int[n1];
		System.out.println("Elements in the array 1 are : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("Enter no of elements in the array 2 : ");
		int n2 = sc.nextInt();
		
		int b[] = new int[n2];
		System.out.println("Elements in the array 2 are : ");
		for(int i = 0; i < b.length; i++){
			
			b[i] = sc.nextInt();
			
		}
		
		int c[] = new int[n1];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				
				if(a[i] == b[j]){
					
					c[i] = 1;
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < c.length; i++){
			
			if(c[i] == 1){
				
				count++;
				
			}
		}
		
		if(count == n1){
			
			System.out.println("Both the arrays are equal");
			
		}
		else{
			
			System.out.println("Both arrays are not equal");
		}
		
	}
}