package Encapsulation;
class Irctc{
	private String pwd="soulsingathi";

	public String getpwd() {
		// TODO Auto-generated method stub
		return pwd;
	}

	public void setpwd(String string) {
		// TODO Auto-generated method stub
		pwd=string;
	}
	
}
public class Mainclass1 {

	public static void main (String[] args) {
		Irctc i1=new Irctc();
		System.out.println(i1.getpwd());
		i1.setpwd("Beargrylls");
		System.out.println(i1.getpwd());
	}

}
