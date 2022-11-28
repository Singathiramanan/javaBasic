package udcasting;
class Cola13{
	int t=23;
	void disp(){
		System.out.println("Java good");
	}
}
class Chungacha1 extends Cola13{
	int d=123;
}
public class Main14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola13 a=new Chungacha1();
		a.disp();
		System.out.println(a.t);
		Chungacha1 b=(Chungacha1)a;
		System.out.println(b.t);
		System.out.println(b.d);
		b.disp();
	}

}
