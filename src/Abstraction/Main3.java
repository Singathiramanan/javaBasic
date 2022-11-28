package Abstraction;
interface Youtube{
	void like();
}
class Video implements Youtube{
	public void like(){
		System.out.println("like the video");
	}
}
class Shorts implements Youtube{
	public void like(){
		System.out.println("like the shorts");
	}
}
class Community implements Youtube{
	public void like(){
		System.out.println("like the photos");
	}
}
class Stimulater2{
	static void look(Youtube g1){
		g1.like();
	}
}
public class Main3 {
 public static void main(String[] args) {
	 Video t1=new Video();
	 Shorts e1=new Shorts();
	 Community h1=new Community();
	 Stimulater2.look(t1);
	 Stimulater2.look(e1);
	 Stimulater2.look(h1);
	 
	
}
}
