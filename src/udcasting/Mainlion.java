package udcasting;
class One
{
	int x=49;
}
class Two extends One
{
	int y=64; 
}
public class Mainlion {
	public static void main(String[] args) {
		System.out.println("Upcasting");
		One o=new Two();
		System.out.println(o.x);
		System.out.println("Downcasting");
		Two t=(Two)o;
		System.out.println(t.x);
		System.out.println(t.y);
		
	}
}
