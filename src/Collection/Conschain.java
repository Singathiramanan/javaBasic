package Collection;

class Tester{
	Tester(){
		System.out.println("hello");
	}
}
class Demo extends Tester{
	
}

class Sample extends Demo{
	Sample(int a){
		System.out.println("hi");
	}
}
public class Conschain
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample(10);
	}

}
