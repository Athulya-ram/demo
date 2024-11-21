package javaprgms;
class parent{
	void print() {
		System.out.println("parent class");
	}
}
class subclass1 extends parent{
	void print() {
		System.out.println("subclass1");
	}
}
class subclass2 extends parent{
	void print() {
		System.out.println("subclass2");
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent a;
		a=new subclass1();
		a.print();
		a=new subclass2();
		a.print();

	}

}
