package udcasting;
class Sample21{
	void co(){
		System.out.println("type casting");
	}
	int y=26;
}
class Hahaa4 extends Sample21{
	void disp(){
		System.out.println("2 types");
	}
}
public class Main13 {
	public static void main(String[] args) {
		System.out.println("Up casting");
		Sample21 a=new Hahaa4();
		a.co();
		System.out.println(a.y);
		System.out.println("Down casting");
		Hahaa4 b=(Hahaa4)a;
		System.out.println(b.y);
		b.co();
		b.disp();
	}
}
