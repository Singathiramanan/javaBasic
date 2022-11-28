package udcasting;
class Cool1{
	void add(){
		System.out.println("I am cool");
	}
}
class Goolata extends Cool1{
	void dispu(){
		System.out.println("I am dhoni");
	}
}
public class main4 {
	public static void main(String[] args) {
	System.out.println("Up casting");
	Cool1 a=new Goolata();
	a.add();
	Goolata b=(Goolata)a;
	b.add();
	b.dispu();
	}
}
