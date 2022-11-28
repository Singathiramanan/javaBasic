package udcasting;

class Demo10{
	double x=146.621;
	int r=120;
}
class Dumtaka1 extends Demo10{
	int y=199;
	
}
public class Main12 {
	public static void main(String[] args) {
		System.out.println("Upcasting");
		Demo10 a=new Dumtaka1();
		System.out.println(a.r);
		System.out.println(a.x);
		System.out.println("Downcasting");
		Dumtaka1 b=(Dumtaka1)a;
		System.out.println(b.r);
		System.out.println(b.x);
		System.out.println(b.y);
		
		
	}
}

