package udcasting;
class Cola1{
	int x=80;
}
class Chungacha extends Cola1{
	int d=76;
}
public class Main7 {
	public static void main(String[] args) {
		System.out.println("Up casting");
		Cola1 a=new Chungacha();
		System.out.println(a.x);
		System.out.println("Down casting");
		Chungacha b=(Chungacha)a;
		System.out.println(b.d);
		System.out.println(b.x);
	}
}
