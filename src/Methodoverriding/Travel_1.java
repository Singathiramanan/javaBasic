package Methodoverriding;

class Irctc_v1{
	void book(){
		System.out.println("Only for train booking");
	}
}
class Irctc_v2 extends Irctc_v1
{
	void book(){
		System.out.println("Flight,bus,hotal can book");
		super.book();
	}
}
public class Travel_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Irctc_v2 a1=new Irctc_v2();
		a1.book();
	}

}
