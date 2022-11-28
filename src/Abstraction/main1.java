package Abstraction;
interface Flipkart{
	void order();
}
class Grocery implements Flipkart{
	public void order(){
		System.out.println("Grocery with discount");
	}
}
class Toys implements Flipkart{
	public void order(){
		System.out.println("Teddy bear");
	}
}
class Furniture implements Flipkart{
	public void order(){
		System.out.println("Table and desk");
	}
}
class Stimulater1{
	static void buy(Flipkart g1){
		g1.order();
	}
}
public class main1 {
 public static void main(String[] args) {
	 Grocery t1=new Grocery();
	 Toys e1=new Toys();
	 Furniture h1=new Furniture();
	 Stimulater1.buy(t1);
	 Stimulater1.buy(e1);
	 Stimulater1.buy(h1);
	 
	
}
}
