package javaprgms;

import java.util.Scanner;

public class Arraysortong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array limit:");
		int a=sc.nextInt();
		System.out.println("enter the  array :");
		int[] arr= new int[a];
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("the ascending order of array is :");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("the largest elements of the array is"+arr[0]);
		System.out.println("the smallest elements of the array is"+arr[arr.length-1]);

	}

}
