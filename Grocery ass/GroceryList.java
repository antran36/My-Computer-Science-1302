public class GroceryList
{
	private static  GroceryItemOrder[] Grocery = new GroceryItemOrder[10];
	private static int emptySlot =0;

	public void add(GroceryItemOrder item)
	{

		{		
				if(emptySlot >9)
				{
					System.out.println("Sorry, you cannot add more items. Your grocery is full. ");
					return;
				}
				Grocery[emptySlot] = item;
				emptySlot++;
		}		
	}
	// print the grocery list
	public void printList()
	{
		System.out.printf("%-15s %-15s %-15s %-20s %-15s","Number","Item Name","Price per Unit","Quantity","Cost" );
		System.out.println();
		for(int i=0; i<emptySlot; i++)
		{
			System.out.printf("%-15d %-15s %-15.2f %-20d %-15.2f",(i+1),Grocery[i].getName(),Grocery[i].getpricePerUnit(), Grocery[i].getQuantity(),Grocery[i].getCost() );
			System.out.println();
		}
	}
	// calculate the total cost
	public double getTotal()
	{
		double sum=0;
		{
			for(int i=0; i < emptySlot; i++)
			{
			sum = sum + Grocery[i].getCost();
			}
		}
		return sum;
	}
	// calculate the number of items in cart
	public int getNumberOfItems()
	{	
		int totalQuantity=0;
		{
			for(int i=0; i < emptySlot; i++)
			{
			totalQuantity = totalQuantity + Grocery[i].getQuantity();
			}
		}
		return totalQuantity;
	}
}
