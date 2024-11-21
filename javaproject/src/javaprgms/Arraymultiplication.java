package javaprgms;

import java.util.Scanner;

public class Arraymultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array limit:");
		int a=sc.nextInt();
		System.out.println("enter the  array :");
		int[] arr= new int[a];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("the sum of  numbers are");
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		System.out.println("the multiplication  of  numbers are");
		for(int i=0;i<=arr.length-1;i++)
		{
			mul=mul*arr[i];
		}
		System.out.println(mul);
		
	}

}
