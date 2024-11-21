package javaprgms;

import java.util.Scanner;

public class stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");{
			String s=sc.nextLine();
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=' ') {
					count++;
					
				}
				
			}
			System.out.println(count);
		}
	}

}
