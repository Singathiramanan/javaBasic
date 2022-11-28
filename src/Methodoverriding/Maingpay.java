package Methodoverriding;
class Transfer_v1
{
	void gpay()
	{
		System.out.println("send money to other person");
	}
}
class Transfer_v2 extends Transfer_v1
{
	void gpay()
	{
		System.out.println("self tranfer");
		super.gpay();
	}
}
public class Maingpay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transfer_v2 q1=new Transfer_v2();
		q1.gpay();
	}

}
