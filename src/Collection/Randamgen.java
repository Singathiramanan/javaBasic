package Collection;

import java.util.Random;

public class Randamgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen=new Random();
		for(int i=0;i<10;i++){
			System.out.println(gen.nextInt(100));
		}

	}

}
