package javaprgms;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum=0,temp;
		int number=686;
		temp=number;
		while(number>0) {
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
		if(temp==sum) {
			System.out.println("palindrome number");
			}
		else {
			System.out.println("not palindrome");
				
			
		}

	}

}
