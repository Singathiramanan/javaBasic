package udcasting;

class Sample{
	void disp(){
		System.out.println("I am parent class");
	}
}
class Ampules extends Sample{
	void tata(){
		System.out.println("I am sub class");
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("up casting");
		Sample a=new Ampules();
		a.disp();
		System.out.println("Down casting");
		Ampules b=(Ampules)a;
		b.disp();
		b.tata();
	}

}
