package udcasting;
class Sample3{
	void one(){
		System.out.println("I am superclass");
	}

}
class Tester2 extends Sample3
{
	void two()
	{
		System.out.println("I am subclass");
	}
}
public class updown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Upcasting");
		Sample3 x=new Tester2();
		x.one();
		System.out.println("Downcasting");
		Tester2 y=(Tester2)x;
		y.one();
		y.two();
	}
}
