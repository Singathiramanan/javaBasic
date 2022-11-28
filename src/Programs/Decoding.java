package Programs;

public class Decoding {

	public static void main(String[] args) {
		String s1="mobile";
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			if(i%2==1){
				int f=ch-2;
				char d=(char)f;
				System.out.print(d);
			}else{
				int f1=ch+2;
				char d=(char)f1;
				System.out.print(d);
			}
			
		}

	}

}
