package Exceptionhand;

public class Array {

	public static void main(String[] args) throws Exception {
		System.out.println("-----Main Starts----");
		try{	
		 	int[] arr={43,78,69,40,32};
			System.out.println(arr[8]);
		}
		catch(Throwable r){
			System.out.println("Handled");
		}
		
		System.out.println("-----Main Ends----");
	}

}
