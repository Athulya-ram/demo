package javaprgms;

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit:");
		int a= sc.nextInt();
		System.out.println("enter the values");
        int [] arr=new int[a];
        for(int i=0;i<=arr.length-1;i++) {
        	arr[i]=sc.nextInt();
        }
    	System.out.println("reverse of array");
    	int [] arr2=new int[a];
    	 for(int i=arr.length-1;i>=0;i--) {
    		 arr2=arr;
    		 System.out.println(arr[i]);
    		 
    	 }
	}

}
