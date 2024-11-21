package javaprgms;

import java.util.Scanner;

public class uppertolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=sc.nextLine();
        for(int i=0;i<=a.length()-1;i++) {
        	char ch=a.charAt(i);
        	if(Character.isUpperCase(ch)) {
        		System.out.println(Character.toLowerCase(ch));
        	}
        	else {
        		System.out.println(Character.toUpperCase(ch));
        	}
        }
}

}
