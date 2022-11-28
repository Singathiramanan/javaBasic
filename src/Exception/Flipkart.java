package Exception;

public class Flipkart {
	static void discount()throws CouponException
	{
		int amount=999;
		if(amount>=1000){
			System.out.println("Coupon accepted");
		}else{
			throw new CouponException("coupon not accepted");
		}
	}
	public static void main(String[] args) {
		try{
			discount();
		}
		catch(CouponException e){
			System.out.println(e.getdiscount());
		}
	}

}
@SuppressWarnings("serial")
class CouponException extends Exception {
	String coupon;
	CouponException(String coupon){
		this.coupon=coupon;
	}
	public String getdiscount(){
		return coupon;
	}
	
}