package Exceptionhand;

public class Separate {

	public static void main(String[] args) {
		String s="Singathi@123";
		String lc="";
		String uc="";
		String no="";
		String sp="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>=65)&&(ch<=90)){
				uc=uc+ch;
			}else if((ch>=97)&&(ch<=122)){
				lc=lc+ch;
			}else if((ch>=48)&&(ch<=57)){
				no=no+ch;
			}else{
				sp=sp+ch;
			}
		}
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(no);
		System.out.println(sp);
	}

}
