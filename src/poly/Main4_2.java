package poly;

class Hotstar{
	void watch(){
		System.out.println("with subscription");
	}
}
class Movies extends Hotstar{
	void watch(){
		System.out.println("new tamil movies");
	}
}
class Series extends Hotstar{
	void watch(){
		System.out.println("good docter series");
	}
}
class Shows extends Hotstar{
	void watch(){
		System.out.println("Super singer junior");
	}
}
class Stimulater4
{
	static void enjoy(Hotstar a1){
		a1.watch();
	}
}
public class Main4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movies d1=new Movies();
		Series c1=new Series();
		Shows s1=new Shows();
		Stimulater4.enjoy(c1);
		Stimulater4.enjoy(d1);
		Stimulater4.enjoy(s1);
		
	}

}
