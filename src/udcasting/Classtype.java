package udcasting;
class Tester4{
	String s="CSK";
}
class Huhuhu extends Tester4{
	void total(){
		System.out.println("i am well");
	}
}
public class Classtype {
 public static void main(String[] args) {
	System.out.println("Up casting");
	Tester4 t1=new Huhuhu();
	System.out.println(t1.s);
	System.out.println("Down casting");
	Huhuhu t2=(Huhuhu)t1;
	System.out.println(t2.s);
	t2.total();
}
}
