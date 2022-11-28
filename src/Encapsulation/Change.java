package Encapsulation;
class Whatsapp{
	private long ph_no=9578704531l;

	public long getPh_no() {
		// TODO Auto-generated method stub
		return ph_no;
	}

	public void setph_no(long l) {
		// TODO Auto-generated method stub
		ph_no=l;
	}
}
public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Whatsapp w1=new Whatsapp();
		System.out.println(w1.getPh_no());
		w1.setph_no(9865911350l);
		System.out.println(w1.getPh_no());
		
	}

}
