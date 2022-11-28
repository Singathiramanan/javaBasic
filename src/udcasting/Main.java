package udcasting;
class Cool{
	int a=64;
}
class Hahaha extends Cool{
	void hi(){
		System.out.println("I am cool");
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println("UPcasting");
		Cool c=new Hahaha();
		System.out.println(c.a);
		System.out.println("Downcasting");
		Hahaha h=(Hahaha)c;
		h.hi();
		System.out.println(h.a);
		
	}
}
