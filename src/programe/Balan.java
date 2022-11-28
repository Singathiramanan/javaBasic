package programe;

public class Balan {

	public static void main(String[] args) {
		int n=199;
		int[] arr=new int[n];
		for(int i=0;i<n-1;i++){
			arr[i]=i+2;
		}
		System.out.print(arr[0]);
		for(int k=1;k<arr.length;k++){
			int count=0;
			for(int l=1;l<=arr[k];l++){
				if(arr[k]%l==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(" "+arr[k]);
			}
		}
	}
}
 