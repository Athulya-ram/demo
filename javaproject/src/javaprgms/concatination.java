package javaprgms;

import java.util.Scanner;

public class concatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to be concatinated:");
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			System.out.println(s1+s2);
			System.out.println(s1.concat(s2));
			System.out.println(s1.toUpperCase());
			System.out.println(s2.toLowerCase());
	}

}
