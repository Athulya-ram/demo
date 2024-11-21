package javaprgms;

import java.util.Scanner;

public class arrayoddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array limit:");
		int a=sc.nextInt();
		System.out.println("enter the  values :");
		int[] arr=new int [a];
		for(int i=0;i<=arr.length-1;i++) 
		{
		   arr[i]=sc.nextInt();
		}
		System.out.println("the even position arrays are:");
		for(int i=1;i<=arr.length-1;i=i+2)
		{
			System.out.println(arr[i]);
		}
		System.out.println("the odd position arrays are:");
		for(int i=0;i<=arr.length-1;i=i+2)
		{
			System.out.println(arr[i]);
		}


	}

}
