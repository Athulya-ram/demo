package javaprgms;

import java.util.Scanner;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array limit:");
		int a=sc.nextInt();
		System.out.println("enter the first array :");
		int[] arr=new int [a];
		int[] arr2=new int [a];
		for(int i=0;i<=arr.length-1;i++) 
		{
		  arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			arr2=arr;
		}
		for(int i=0;i<=arr2.length-1;i++) {
			
			System.out.println(arr2[i]);
		}
	}




	}


