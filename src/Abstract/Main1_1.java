package Abstract;
abstract class Sample{
	abstract void disp();
	abstract void test();
}
class Tester extends Sample{
	void disp(){
		System.out.println("welcome");
	}
	void test(){
		System.out.println("Hello");
	}
}
public class Main1_1 {
	public static void main(String[] args){
	Tester t1=new Tester();
	t1.disp();
	t1.test();
	}
}
