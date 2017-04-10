//This class describes an advance ticket 
public class AdvanceTicket extends Ticket
{
	private int daysInAdvance;

	public AdvanceTicket( int daysInAdvance)
	{
		super();
		this.daysInAdvance = daysInAdvance;
		if(daysInAdvance >=10)
		{
		super.setPrice(30); // price is 30 when purchase more than 10 days
		}
		 else 
		{
		super.setPrice(40); // price is 40 when less than 10 days
		}
	}
	public String toString()
	{
	return ("Ticket number: " + super.getNumber() +". Price: " + super.getPrice()+ "Purchase: " + this.daysInAdvance +" days in advance.");
	}
}
