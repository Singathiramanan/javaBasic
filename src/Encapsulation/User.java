package Encapsulation;
class Insta{
	private String pwd="singathi";

	public String getpwd() {
		// TODO Auto-generated method stub
		return pwd;
	}

	public void setpwd(String pwd) {
		// TODO Auto-generated method stub
		this.pwd=pwd;
	}
}
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insta a1=new Insta();
		System.out.println(a1.getpwd());
		a1.setpwd("Beargrylls");
		System.out.println(a1.getpwd());
		
	}

}
