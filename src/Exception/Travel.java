package Exception;

public class Travel {
	static void travel()throws TicketException
	{
		int amount=10;
		if(amount>=11){
			System.out.println("Getting ticket");
		}else{
			throw new TicketException("not given ticket");
		}
	}
	public static void main(String[] args) {
		try{
			travel();
		}
		catch(TicketException e){
			System.out.println(e.getticket());
		}
	}

}
@SuppressWarnings("serial")
class TicketException extends Exception {
	String ticket;
	TicketException(String ticket){
		this.ticket=ticket;
	}
	public String getticket(){
		return ticket;
	}
	
}