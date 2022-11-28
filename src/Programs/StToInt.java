package Programs;

public class StToInt {

	public static void main(String[] args) {
		String str="87694";
		int no=Integer.parseInt(str);
		System.out.println(no);
		int sum=0;
		while(no!=0){
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
		

	}

}
