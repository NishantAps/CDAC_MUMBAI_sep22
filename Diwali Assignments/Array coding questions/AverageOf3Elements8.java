import java.lang.*;
import java.util.*;

class AverageOf3Elements8{
	
	public static void main(String args[]){
		
		int a[] = { 5,14,35,89,140 };
		int n = a.length;
		
		int b[] = new int[3];
		
		int i = 0;
		int j = 0;
		
		while(n >= 3){
			int sum = 0;
			sum = a[i] + a[++i] + a[++i];
			b[j] = sum/3;
			j++;
			i = j;
			n--;
		}
		
		System.out.println("Array of sum is : ");
		for(int x : b){
			
			System.out.println(x);
		}
	}
}