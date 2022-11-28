package Exception;

public class Amazon {
	static void buy()throws OfferException
	{
		int amount=999;
		if(amount>=1000){
			System.out.println("Offer available");
		}else{
			throw new OfferException("Not available");
		}
	}
	public static void main(String[] args) {
		try{
			buy();
		}
		catch(OfferException e){
			System.out.println(e.getoffer());
		}
	}

}
@SuppressWarnings("serial")
class OfferException extends Exception {
	String offer;
	OfferException(String offer){
		this.offer=offer;
	}
	public String getoffer(){
		return offer;
	}
	
}