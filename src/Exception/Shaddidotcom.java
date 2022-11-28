package Exception;

public class Shaddidotcom {
	static void Submit()throws MarriageException
	{
		int age=18;
		if(age>=21){
			System.out.println("valid age");
		}else{
			throw new MarriageException("Invalid age");
		}
	}
	public static void main(String[] args) {
		try{
			Submit();
		}
		catch(MarriageException e){
			System.out.println(e.getmarrage());
		}
	}

}
@SuppressWarnings("serial")
class MarriageException extends Exception {
	String mrg;
	MarriageException(String mrg){
		this.mrg=mrg;
	}
	public String getmarrage(){
		return mrg;
	}
	
}