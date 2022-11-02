// Menu driven program 

import java.util.*;

class MenuDriven{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		
		System.out.print("Enter No of Elements : ");
		int n=sc.nextInt();
		
		int arr1[]=new int[n];
		
		for (int i=0;i<10;i++){
			System.out.println("Menu: \n1. Display Arrays : \n2. Search Element : \n3. Delete Element :  \n4. Insert Element : \n5. Exit");
			int m=sc.nextInt();
			if (m==5){
			System.out.println("Program Terminated ");
			break;
	
			}
			else{
			switch (m){
				case 1: display(arr1,n);
				break;
				
				case 2: search(arr1,n);
				break;
				
				case 3: delete(arr1,n);
				break;
				
				case 4: insert(arr1,n);
				break;
	
				default:
				System.out.println("Invalid Input ");
				
			}
		
			
		}
	
		
	}
}

	static void display(int arr1[], int n){
		
		for (int i=0;i<arr1.length;i++){
			System.out.println(" Array Elements are : "+arr1[i]);
		}
		
	}
	
	
	static void search(int arr1[],int n){
		System.out.print("Enter Element to be searched : ");
		int key=sc.nextInt();
		for(int i=0;i<arr1.length;i++){
			
			if (i==n-1){
				System.out.println("Not Found");
			}
			else if (arr1[i]==key) {
				System.out.println("Found At "+(i));
				break;
			}
			
			if(arr1[i]!=key){
				continue;
			}
		}
	}
	
	static void delete(int arr1[], int n){
		System.out.println("Enter Element to be deleted : ");
		int key=sc.nextInt();
		int i;
		try{
		for( i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]==key)
				break;
		}
		for(int k=i;k<=arr1.length-1;k++)
		{
			arr1[k]=arr1[k+1];
		}
		}
		catch (Exception e){
			System.out.println();
		}
		/*for(i=0;i<=arr1.length-1;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		*/
	}
	
	/*
	static void delete(int arr1[], int n){
		System.out.println("Enter Element to be deleted : ");
		int key=sc.nextInt();
		int i;
		try{
		for(i=0;i<=n-1;i++)
			if(arr1[i] == key)
				break;
			if(i == n){
			//break;
			}
			else 
			{
				for(int k=i;k<=n-1;k++){
					arr1[k] = arr1[k+1];
					n--;
			//break;
			//return true;
				}
			}
		}
		catch (Exception e){
			System.out.println();
		}
		
	}
	
	*/
	
	static void insert(int arr1[], int n){
		for(int i=0;i<arr1.length;i++){
			System.out.println("Enter Element "+i+" : ");
			arr1[i]=sc.nextInt();
		}
	}






}