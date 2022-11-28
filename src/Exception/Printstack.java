package Exception;

public class Printstack {
	static void disp3(){
		@SuppressWarnings("unused")
		int i=1/0;
	}
	static void disp2(){
		disp3();
	}
	static void disp1(){
		disp2();
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		try{
		disp1();}
		catch(ArithmeticException p){
			p.printStackTrace();
		}
		System.out.println("Main End");
	}
}
