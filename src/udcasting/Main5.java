package udcasting;
class Demo1{
	double z=128.678;
}
class Dumtaka extends Demo1{
	int x=67;
}
public class Main5 {
	public static void main(String[] args) {
		System.out.println("up casting");
		Demo1 a=new Dumtaka();
		System.out.println(a.z);
		System.out.println("Down casting");
		Dumtaka b=(Dumtaka)a;
		System.out.println(b.x);
		System.out.println(b.z);
	}
}
