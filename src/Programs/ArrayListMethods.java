package Programs;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListMethods {

	public static void main(String[] args) {
		Random gen=new Random();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			l1.add(gen.nextInt(40));
			l2.add(gen.nextInt(60));
		}
		l1.add(4, 26);
		l1.addAll(l2);
		l2.addAll(6,l1);
		l1.clear();
	}

}
