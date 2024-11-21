package javaprgms;
abstract class shape{
	abstract void draw();
}
class Rectangle extends shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
	class Circle1 extends shape{
		void draw() {
			System.out.println("drawing circle");
		}
	}
	
	

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new Circle1();
		s.draw();

	}

}
