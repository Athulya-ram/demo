package javaprgms;


	class one{
		public void print_geek() {
			System.out.println("Geeks");
		}
	}
	class two extends one{
		public void print_for() {
			System.out.println("for");
		}
	}

	public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two g=new two();
		g.print_geek();
		g.print_for();
		g.print_geek();

	}
    }   

