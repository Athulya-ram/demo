package javaprgms;
class helper{
	static int Multiply(int a,int b) {
		return a*b;
		
	}
	static double Multiply(double a,double b) {
		return a*b;
	}
}

public class methodoverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(helper.Multiply(2, 4));
		System.out.println(helper.Multiply(5.5, 6.3));

	}

}
