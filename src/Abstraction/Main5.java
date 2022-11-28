package Abstraction;
interface Documents{
	void save();
}
class Word implements Documents{
	public void save(){
		System.out.println("pay mobile recharge");
	}
}
class Pdf implements Documents{
	public void save(){
		System.out.println("pay electricity bill");
	}
}
class Excel implements Documents{
	public void save(){
		System.out.println("pay broadband bill");
	}
}
class Stimulater4{
	static void creat(Documents g1){
		g1.save();
	}
}
public class Main5 {
 public static void main(String[] args) {
	 Word t1=new Word();
	 Pdf e1=new Pdf();
	 Excel h1=new Excel();
	 Stimulater4.creat(t1);
	 Stimulater4.creat(e1);
	 Stimulater4.creat(h1);
	 
	
}
}
