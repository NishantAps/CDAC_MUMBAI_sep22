import java.lang.*;
import java.util.*;

class IntersectionOfArray16{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in array 1 : ");
		int n1 = sc.nextInt();
		
		int a[] = new int[n1];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the no of the elements in array 2 : ");
		int n2 = sc.nextInt();
		
		int b[] = new int[n2];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			b[i] = sc.nextInt();
			
		}
		
	    ArrayList<Integer> l1 = new ArrayList<Integer>();
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] == b[j]){
					if(l1.contains(a[i])){
						continue;
						
					}
					
					else{
						
						l1.add(a[i]);
					}
				}
			}
		}
		System.out.println("Intersection between two array is : ");
		System.out.print("[ ");
		for(Integer x : l1){
			
			System.out.print(x+" ");
		}
		System.out.println("]");
	}
}