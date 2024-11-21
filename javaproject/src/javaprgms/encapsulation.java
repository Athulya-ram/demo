package javaprgms;
class person{
	private int age;
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) {
		this.age=age;
		
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		p1.setAge(22);
		System.out.println("my age is"+p1.getAge());

	}

}
