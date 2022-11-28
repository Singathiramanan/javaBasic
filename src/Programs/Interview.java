package Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Interview {
	public int candies(int i1,int i2,int[] i3) throws Exception{
		int n=i1,b=i2;
		int[] a=i3;
		ArrayList<Integer> arr=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				arr.add(a[i]);				
			}
			Collections.sort(arr);
			Collections.reverse(arr);
			for(int i=0;i<n;i++){
				if(i==b-1)
					return(arr.get(i));
		}
	throw new Exception("candies(int i1,int i2,int[] i3)");

	}   	
}
