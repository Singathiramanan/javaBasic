package Encapsulation;
class Adhaar{
	private String name="venkat";

	public String getname() {
		return name;
	}

	public void setname(String string1) {
		name=string1;
	}
	
}
public class Newname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adhaar a1=new Adhaar();
		System.out.println(a1.getname());
		a1.setname("Ramanan");
		System.out.println(a1.getname());
	}

}
