package Exception;

public class Dream11 {
	static void add()throws BounusException
	{
		int addmoney=30;
		if(addmoney>=50){
			System.out.println("Bounus available");
		}else{
			throw new BounusException("Bounus not available");
		}
	}
	public static void main(String[] args) {
		try{
			add();
		}
		catch(BounusException e){
			System.out.println(e.getbounus());
		}
	}

}

@SuppressWarnings("serial")
class BounusException extends Exception {
	String bounus;
	BounusException(String bounus){
		this.bounus=bounus;
	}
	public String getbounus(){
		return bounus;
	}
	
}