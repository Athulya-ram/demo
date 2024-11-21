package javaprgms;

import java.util.Scanner;

public class vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		int c=0,c1=0;{
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
					c++;
				}
				else {
					c1++;
					
				}
			}
		}
System.out.println(c);
	}

}
