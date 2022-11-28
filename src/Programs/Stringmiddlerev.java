package Programs;

public class Stringmiddlerev {

	public static void main(String[] args) {
		String str="Ram likes Musambi",rev="";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			if(i==arr.length/2){
				for(int j=arr[i].length()-1;j>=0;j--){
					rev=rev+arr[i].charAt(j);
				}
				System.out.print(rev+" ");
			}else
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
