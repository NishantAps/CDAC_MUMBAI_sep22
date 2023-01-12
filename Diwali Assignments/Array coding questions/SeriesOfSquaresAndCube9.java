import java.lang.*;
import java.util.*;

class SeriesOfSquaresAndCube9{
	
	public static void main(String args[]){
		
		int a[] = new int[6];
		int j = 0;
		for(int i = 1; i <= 6; i++){
			
			if(i % 2 != 0){
				
				a[j] = i*i*i;
				j++;
			}
			
			else{
				
				a[j] = i*i;
				j++;
				
			}
		}
		
		System.out.println("Required series is : ");
		for(int x : a){
			
			System.out.println(x);
		}
	}
}