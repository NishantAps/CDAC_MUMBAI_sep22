import java.lang.*;
import java.util.*;

class ZeroAndNonZeros20{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
		}
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++){
			
			if(a[i] == 0){
				
				l1.add(0);
			}
			else{
				
				l2.add(a[i]);
			}
		}
		
		System.out.println("Array after separation is(Zeros): ");
		for(Integer c : l1){
			
			System.out.println(c);
		}
		
		System.out.println("Array after separation is(Non zeros): ");
		for(Integer b : l2){
			
			System.out.println(b);
		}
	}
}