public class GroceryItemOrder
{
	private String name;
	private double pricePerUnit;
	private int quantity;

	public GroceryItemOrder(String itemName, double itemPrice, int itemQuantity)
	{
			this.name = itemName;
			this.pricePerUnit = itemPrice;
			this.quantity = itemQuantity;
	}



	public void setName(String itemName)
	{
		this.name = itemName;
	}

	public void setpricePerUnit(double itemPrice)
	{
		this.pricePerUnit = itemPrice;
	}
	public void setQuantity(int itemQuantity)
	{
		this.quantity= itemQuantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getName()
	{
		return name;
	}
	public double getpricePerUnit()
	{
		return pricePerUnit;
	}
	public String toString()
	{
		return this.name + "\t" + this.pricePerUnit + "\t" + this.quantity +"\t"+ getCost()  ;
	}
	//print out the cost of one item type
	public double getCost()
	{
	 	double cost = pricePerUnit*quantity;
	 	return cost;
	}
}