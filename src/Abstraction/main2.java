package Abstraction;
interface Gkeyboard{
	void lang();
}
class Tamil implements Gkeyboard{
	public void lang(){
		System.out.println("Tmail keyboard is displayed");
	}
}
class English implements Gkeyboard{
	public void lang(){
		System.out.println("English keyboard is displayed");
	}
}
class Hindi implements Gkeyboard{
	public void lang(){
		System.out.println("Hindi keyboard is displayed");
	}
}
class Stimulater{
	static void type(Gkeyboard g1){
		g1.lang();
	}
}
public class main2 {
 public static void main(String[] args) {
	 Tamil t1=new Tamil();
	 English e1=new English();
	 Hindi h1=new Hindi();
	 Stimulater.type(t1);
	 Stimulater.type(e1);
	 Stimulater.type(h1);
	 
	
}
}
