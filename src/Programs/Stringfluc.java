package Programs;

public class Stringfluc {

	public static void main(String[] args) {
		String str="i am comming from chennai";
		String fu="";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++){
			String str1=arr[i];
			 fu = fu+str1.substring(0, 1).toUpperCase()+str1.substring(1)+" ";
		}
		System.out.println(fu);
	}

}
