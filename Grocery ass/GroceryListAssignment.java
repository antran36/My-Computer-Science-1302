/*input
2
Milk
2.0
2
4
1
2
Bread
4.0
3
1
4
3	
5
*/

import java.util.Scanner;
import java.util.Arrays;
public class GroceryListAssignment
{	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args)
	{
		boolean quit= true;
		int choice =0;
		printInstruction();
		while(quit)
		{
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice)
			{
				case 0:
				printInstruction();
				break;
				case 1:
				printGroceryList();
				break;
				case 2:
				addItem();
				break;
				case 3:
				checkNumberOfItems();
				break;
				case 4:
				checkTotal();
				break;
				case 5:
				quit = false;
				break;
			}
		}
	}
		public static void printInstruction()
		{
			System.out.println("\t 0 - To print the instruction.");
			System.out.println("\t 1 - To print the grocery list.");
			System.out.println("\t 2 - To add item in your cart.");
			System.out.println("\t 3 - To print the number of items.");
			System.out.println("\t 4 - To print the total.");
			System.out.println("\t 5 - To quit.");
		}
		public static void printGroceryList()
		{
			groceryList.printList();
		}
		public static void addItem()
		{
			System.out.println("Please enter item name: ");
			String name = scanner.nextLine();
			System.out.println("Please enter item price: ");
			double price = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Please enter item quantity: ");
			int quantity =scanner.nextInt();
			scanner.nextLine();
			GroceryItemOrder item = new GroceryItemOrder(name,price,quantity);
			groceryList.add(item);			
		}
		public static void checkNumberOfItems()
		{
			System.out.println("You have " + groceryList.getNumberOfItems() +" items in your cart.");
		}
		public static void checkTotal()
		{
			System.out.println("Your total is " + groceryList.getTotal());
		}
}