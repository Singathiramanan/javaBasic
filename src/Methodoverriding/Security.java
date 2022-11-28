package Methodoverriding;
class Mobilelock_v1
{
	void lock()
	{
		System.out.println("Password,Pattern");
	}
}
class Mobilelock_v2 extends Mobilelock_v1
{
	void lock()
	{
		System.out.println("Pattern,Password,Finger print,Faceock");
	}
}
public class Security {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobilelock_v2 q1=new Mobilelock_v2();
		q1.lock();
	}

}
