package poly;

class Amazon{
	void buy(){
		System.out.println("Good product");
	}
}
class Pendrive extends Amazon{
	void buy(){
		System.out.println("Sandisk 128gb RAM");
	}
}
class Mobile extends Amazon{
	void buy(){
		System.out.println("Redmi 8gb RAM");
	}
}
class Laptop extends Amazon{
	void buy(){
		System.out.println("Lenovo 8gb Ram");
	}
}
class Stimulater1
{
	static void order(Amazon a1){
		a1.buy();
	}
}
public class Main1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendrive d1=new Pendrive();
		Mobile c1=new Mobile();
		Laptop s1=new Laptop();
		Stimulater1.order(c1);
		Stimulater1.order(d1);
		Stimulater1.order(s1);
		
	}

}
