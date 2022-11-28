package Exceptionhand;

public class Main1_3 {

	public static void main(String[] args) {
		System.out.println("-----Main Starts----");
		try{	
		 	int i=1/0;
		 	System.out.println(i);
		 	try{
		 	int[] array={46,90,78,64,12};
		 	System.out.println(array[8]);
		 	}
		 	catch(ArrayIndexOutOfBoundsException e){
		 		System.out.println("caught");
		 	}
			
		}
		catch(ArithmeticException e){
			System.out.println("Handled");
		}
		System.out.println("-----Main Ends----");
	}

}
