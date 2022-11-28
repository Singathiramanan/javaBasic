package udcasting;

class Demo{
	int x=69;
}
class Pemocha extends Demo{
	void ho(){
		System.out.println("sub class");
	}
}
public class Main1_4 {

	public static void main(String[] args) {
		System.out.println("Up casting");
		Demo a=new Pemocha();
		System.out.println(a.x);
		System.out.println("Down casting");
		Pemocha b=(Pemocha)a;
		System.out.println(b.x);
		b.ho();
		
	}

}
