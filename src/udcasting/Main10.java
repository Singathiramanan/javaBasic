package udcasting;
class Tester3{
	int r=90;
	void disp(){
		System.out.println(r);
	}
}
class Thsta extends Tester3{
	void ullya(){
		System.out.println("Bangalore");
	}
}
public class Main10 {
	public static void main(String[] args) {
		Tester3 a=new Thsta();
		System.out.println(a.r);
		a.disp();
		System.out.println("Down casting");
		Thsta b=(Thsta)a;
		System.out.println(b.r);
		b.disp();b.ullya();
	}
}
