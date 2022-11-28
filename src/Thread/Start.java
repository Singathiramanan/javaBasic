package Thread;
class Demo implements Runnable{
	public void run(){
		System.out.println("Hello");
	}
}
class Sample extends Thread{
	public void run(){
		System.out.println("Hi");
	}
}
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		Thread t1=new Thread(s);
		t1.start();
		
		Demo d=new Demo();
		Thread t2=new Thread(d);
		t2.start();
			}

}
