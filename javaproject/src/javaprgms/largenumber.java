package javaprgms;

import java.util.Scanner;

public class largenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System .out.println("enter 3 number:");
		{
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=sc.nextInt();
		
		 if(n1>n2&&n1>n3) {
			 System.out.println("the gretest number is "+n1);
			 
		 }else if(n2>n3) {
			 
			 System.out.println("the gretest number is "+n2);
		 }
		 
		 else {
			 System.out.println("the gretest number is "+n3);
			 
		 }
		}

	}

}
