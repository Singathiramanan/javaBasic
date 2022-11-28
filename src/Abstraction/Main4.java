package Abstraction;
interface Gpay{
	void pay();
}
class Mobile implements Gpay{
	public void pay(){
		System.out.println("pay mobile recharge");
	}
}
class Electricity implements Gpay{
	public void pay(){
		System.out.println("pay electricity bill");
	}
}
class Broadband implements Gpay{
	public void pay(){
		System.out.println("pay broadband bill");
	}
}
class Stimulater3{
	static void bill(Gpay g1){
		g1.pay();
	}
}
public class Main4 {
 public static void main(String[] args) {
	 Mobile t1=new Mobile();
	 Electricity e1=new Electricity();
	 Broadband h1=new Broadband();
	 Stimulater3.bill(t1);
	 Stimulater3.bill(e1);
	 Stimulater3.bill(h1);
	 
	
}
}
