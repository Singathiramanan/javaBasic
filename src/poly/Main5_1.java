package poly;

class News{
	void read(){
		System.out.println("Read news paper");
	}
}
class Tamil extends News{
	void read(){
		System.out.println("Dinamalar");
	}
}
class English extends News{
	void read(){
		System.out.println("The Hindu");
	}
}
class Kannada extends News{
	void read(){
		System.out.println("Vijayavani");
	}
}
class Stimulater5
{
	static void enjoy(News a1){
		a1.read();
	}
}
public class Main5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tamil d1=new Tamil();
		English c1=new English();
		Kannada s1=new Kannada();
		Stimulater5.enjoy(c1);
		Stimulater5.enjoy(d1);
		Stimulater5.enjoy(s1);
		
	}

}
