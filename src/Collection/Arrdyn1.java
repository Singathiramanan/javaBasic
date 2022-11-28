package Collection;

import java.util.ArrayList;

public class Arrdyn1 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList<Comparable> l1=new ArrayList<Comparable>();
		l1.add(10);
		l1.add(20.67);
		l1.add('A');
		l1.add("venkata");
		l1.add(true);
		System.out.println(l1);
		l1.add(4,"Ramanan");
		System.out.println(l1);
	}
}
