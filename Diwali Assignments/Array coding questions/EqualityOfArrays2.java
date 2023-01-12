import java.lang.*;
import java.util.*;

class EqualityOfArrays2{
	
	public static void main(String args[]){
		
		int a[] = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int b[] = new int[5];
		
		b[0] = 1;
		b[1] = 4;
		b[2] = 5;
		b[3] = 2;
		b[4] = 3;
		
		int c[] = new int[5];
		
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
		
		if(count == 5){
			
			System.out.println("Both arrays are equal.");
			
		}
		else{
			
			System.out.println("Both arrays are not equal.");
		}
		
	}
}