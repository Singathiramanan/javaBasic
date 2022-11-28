package Programs;

public class zxcvbn {

	public static void main(String[] args) {
		char[] s = "AAABBCCDDAACCBBBB".toCharArray();
		char[] input = "BB".toCharArray(); 
		int count=0;
		for(int i=0;i<s.length-input.length;i++){
			int temp=0;
			for(int j=0;j<input.length;j++){
				if(s[i+j]==input[j]){
					temp++;
					
				}
				
				if(temp==input.length){
					count++;
					i=i+input.length;
					
				}
			}
		}
		System.out.println(count);

	}

}
