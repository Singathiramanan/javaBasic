package udcasting;
class Hot{
	double x=8716391.32878;
}
class Hahha extends Hot{
	void bye(){
		System.out.println("I am out");
	}
}
public class Money {
	public static void main(String[] args) {
		System.out.println("Upcasting");
		Hot m=new Hahha();
		System.out.println(m.x);
		System.out.println("Downcasting");
		Hahha n=(Hahha)m;
		System.out.println(n.x);
		n.bye();
	}
}
