package Methodoverriding;

class Massage_v1
{
	void text()
	{
		System.out.println("Text massage");
	}
}
class Massage_v2 extends Massage_v1
{
	void text()
	{
		System.out.println("Text massage,Audio,Emoji with multiple persion");
	}
}
public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Massage_v2 q1=new Massage_v2();
		q1.text();
	}

}
