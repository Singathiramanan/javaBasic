package poly;

class Pghostal{
	void room(){
		System.out.println("Monthly payment");
	}
}
class Twoshare extends Pghostal{
	void room(){
		System.out.println("Monthly 5800Rs");
	}
}
class Threeshare extends Pghostal{
	void room(){
		System.out.println("Monthly 5500Rs");
	}
}
class Fourshare extends Pghostal{
	void room(){
		System.out.println("Monthly 5200Rs");
	}
}
class Stimulater2
{
	static void guest(Pghostal a1){
		a1.room();
	}
}
public class Main2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twoshare d1=new Twoshare();
		Threeshare c1=new Threeshare();
		Fourshare s1=new Fourshare();
		Stimulater2.guest(c1);
		Stimulater2.guest(d1);
		Stimulater2.guest(s1);
		
	}

}
