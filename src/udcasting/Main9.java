package udcasting;
class Cool2{
	void disp(){
		System.out.println("Java king");
	}
}
class Dinga extends Cool2{
	void total(){
		System.out.println("Alone");
	}
}
public class Main9 {
	public static void main(String[] args) {
		System.out.println("Up casting");
		Cool2 a=new Dinga();
		a.disp();
		System.out.println("Down casting");
		Dinga b=(Dinga)a;
		b.disp();
		b.total();
	}
}
