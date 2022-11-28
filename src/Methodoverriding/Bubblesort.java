package Methodoverriding;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={80,12,60,20,2};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
			
		}
		
	}

}
