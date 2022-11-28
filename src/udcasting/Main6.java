package udcasting;
class Sample2{
	void co(){
		System.out.println("Hello");
	}
}
class Guleyluu extends Sample2{
	void disp1(){
		System.out.println("welcome");
	}
}
public class Main6 {
public static void main(String[] args) {
	System.out.println("Up casting");
	Sample2 a=new Guleyluu();
	a.co();
	System.out.println("Down casting");
	Guleyluu b=(Guleyluu)a;
	b.co();
	b.disp1();
}
}
