package poly;

class Zomato{
	void order(){
		System.out.println("Good with offer");
	}
}
class Parotta extends Zomato{
	void order(){
		System.out.println("offer 30 percent");
	}
}
class Briyani extends Zomato{
	void order(){
		System.out.println("offer 45 percent");
	}
}
class Pizza extends Zomato{
	void order(){
		System.out.println("offer 50 percent");
	}
}
class Stimulater3
{
	static void food(Zomato a1){
		a1.order();
	}
}
public class Main3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parotta d1=new Parotta();
		Briyani c1=new Briyani();
		Pizza s1=new Pizza();
		Stimulater3.food(c1);
		Stimulater3.food(d1);
		Stimulater3.food(s1);
		
	}

}
