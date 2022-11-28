package programe;

import java.util.ArrayList;
import java.util.Random;

public class Muthu {

	public static void main(String[] args) {
		CustomList number=new CustomList();
		number.insert(10);
		number.printList();
		number.fetch(3);
		number.total();
	}
}
class CustomList
	{
	ArrayList<Integer> num=new ArrayList<Integer>();
	ArrayList<Integer> value=new ArrayList<Integer>();
	public void insert(int no){
		int[] arr=new int[no];
		Random gen=new Random();
		for(int i=0;i<no;i++){
			arr[i]=gen.nextInt(100);
			System.out.println(arr[i]);
			if(!num.contains(arr[i])){
				num.add(arr[i]);
			}
		}
	
	}
	
	void fetch(int s)
	{
		System.out.println("Fetched element");
		System.out.println(num.get(s));
	}
	public void printList()
	{
		System.out.println("****");
		for(int a1:num){
			System.out.println(a1);
		}
	}
	void total()
	{
		System.out.println("Total");
		System.out.println(num.size());
	}
		
}

