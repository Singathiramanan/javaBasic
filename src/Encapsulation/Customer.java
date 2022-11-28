package Encapsulation;

class Kvb_bank{
	private int atmpin=6720;

	public int getatmpin() {
		// TODO Auto-generated method stub
		return atmpin;
	}

	public void setatmpin(int i) {
		// TODO Auto-generated method stub
		atmpin=i;
	}
	
}
public class Customer {

	public static void main(String[] args) {
		Kvb_bank k1=new Kvb_bank();
		System.out.println(k1.getatmpin());
		k1.setatmpin(3007);
		System.out.println(k1.getatmpin());
	}

}
