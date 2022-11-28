package udcasting;
class Tester{
	int r=10;
}
class Tista extends Tester{
	void uiija(){
		System.out.println("Hey uiiya");
	}
}
public class Main3 {
	public static void main(String[] args) {
		System.out.println("Up casting");
		Tester a=new Tista();
		System.out.println(a.r);
		Tista b=(Tista)a;
		System.out.println(b.r);
		b.uiija();
	}
}
