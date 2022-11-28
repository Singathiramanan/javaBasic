package Exception;

public class Pass {
	static void Passmark()throws Pass35Exception
	{
		int mark=34;
		if(mark>=35){
			System.out.println("pass mark");
		}else{
			throw new Pass35Exception("fail mark");
		}
	}
	public static void main(String[] args) {
		try{
			Passmark();
		}
		catch(Pass35Exception e){
			System.out.println(e.getmark());
		}
	}

}
@SuppressWarnings("serial")
class Pass35Exception extends Exception {
	String mark;
	Pass35Exception(String mark){
		this.mark=mark;
	}
	public String getmark(){
		return mark;
	}
	
}