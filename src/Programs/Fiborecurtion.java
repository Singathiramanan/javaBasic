package Programs;

public class Fiborecurtion {
	
	public static void main(String[] args) {
		int no=5;
		System.out.println(fibo(no));
	}
	private static long fibo(int no) {
		if(no<=1){
			return no;
		}
		return(fibo(no-1)+fibo(no-2));		
	}

}
