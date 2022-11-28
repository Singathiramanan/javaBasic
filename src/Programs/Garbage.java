 package Programs;
class Object{
	public void finalize(){
		System.out.println("Hi");
	}
}

public class Garbage {
	@SuppressWarnings("unused")
	public static void main(String[] args) {		
		Object g1=new Object();
		Object g2=new Object();
		Object g3=new Object();
		Object g4=new Object();
		g1=null;
		g2=null;
		g3=null;
		g4=null;
		System.gc();
		
		
	}

}
