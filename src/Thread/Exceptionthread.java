package Thread;


class Sample1 extends Thread{
	public void run(){
		System.out.println("Hi");
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class Exceptionthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s=new Sample1();
		Thread t1=new Thread(s);
		t1.start();
		System.gc();
		}
}

