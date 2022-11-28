package udcasting;
class Cool4{
	void add(){
		System.out.println("upcasting");
	}
}
class Goolata1 extends Cool4{
	void disp(){
		System.out.println("Downcasting");
	}
	int r=123;
}
public class Main11 {
	public static void main(String[] args) {
		Cool4 a=new Goolata1();
		a.add();
		Goolata1 b=(Goolata1)a;
		System.out.println(b.r);
		b.add();
		b.disp();
	}
}

