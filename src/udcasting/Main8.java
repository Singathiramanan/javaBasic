package udcasting;
class Tester1{
	int x=20;
	void disp(){
		System.out.println(x);
	}
}
class Hullyacha extends Tester1{
	void ho(){
		System.out.println("Smile please");
	}
}
public class Main8 {
	public static void main(String[] args) {
		Tester1 a=new Hullyacha();
		System.out.println(a.x);
		a.disp();
		System.out.println("Down casting");
		Hullyacha b=(Hullyacha)a;
		System.out.println(b.x);
		b.disp();
		b.ho();
	}
}
