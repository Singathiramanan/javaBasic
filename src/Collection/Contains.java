package Collection;

import java.io.Serializable;
import java.util.ArrayList;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Man");
		l1.add("Women");
		l1.add("Kids");
		l1.add("Toys");
		System.out.println(l1);
		if(l1.contains("Kids")){
		System.out.println("Test case is pass");}
		l1.remove("Toys");
		System.out.println(l1);
		ArrayList<Serializable> l2=new ArrayList<Serializable>();
		l2.add(2);
		l2.add(1);
		l2.add(3);
		System.out.println(l2.add(l1));
		System.out.println(l2.remove(2));
		System.out.println(l2);
		

	}

}
