package Exception;
import java.util.*;
import java.util.Map.Entry;

public class Maparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Integer> l1=new LinkedHashMap<Integer,Integer>();
		int[] arr={10,30,20,60,30,10,40};
		for(int i=0;i<arr.length;i++){
			if(!l1.containsKey(arr[i])){
				l1.put(arr[i], 1);
			}else{
				int x=l1.get(arr[i]);
				x++;
				l1.put(arr[i],x);
			}
		}
		for(Entry<?, ?> a1 : l1.entrySet()){
			if(l1.get(a1.getKey())==1){
				System.out.println(a1.getKey()+" "+a1.getValue());
			}
		}
	}

}
