import java.lang.*;
import java.util.*;

class DuplicateElements18{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("Duplicate elements int the array are : ");
		for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length; j++){
				
				if(a[i] == a[j]){
					if(l1.contains(a[i])){
						continue;
					}
					else{
						l1.add(a[i]);
					}
				}
			}
		}
		
		for(Integer x : l1){
			System.out.println(x);
		}
	}
}