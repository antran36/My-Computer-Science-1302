public class Ticket
{
	private int number;
	private double price;
	public static int no=1;

	public Ticket()
	{
		this.number = no;
		no++;
	}

	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double price)
	{
		this.price= price;
	}
	public int getNumber()
	{
		return number;
	}
	public String toString()
	{
		return ("Ticket number: " + number +". Price: " + price);
	}
}