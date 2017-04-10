import java.util.Scanner;
public class TicketAssignment
{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice=0;
		boolean quit = false;
		
		while(!quit)
		{
		printInstruction();
		choice = scan.nextInt();
		scan.nextLine();
		switch(choice)
		{
			case 0:
			printInstruction();
			break;
			case 1:
			walkUpTicket();
			break;
			case 2:
			advanceTicket();
			break;
			case 3:
			studentAdvanceTicket();
			break;
			case 4:
			quit = true;
			break;
		}
	}
		System.out.println("Thank you for purchasing.");
	}
	public static void printInstruction()
	{
		System.out.println("\t 0 - To print the instruction.");
			System.out.println("\t 1 - To buy a walk up ticket.");
			System.out.println("\t 2 - To purchase ticket in advance.");
			System.out.println("\t 3 - If you are a student and want to buy ticket in advance.");
			System.out.println("\t 4 - To quit.");
	}
	public static void walkUpTicket()
	{
		WalkUpTicket ticket = new WalkUpTicket();
		System.out.println(ticket);
	}
	public static void advanceTicket()
	{
		System.out.println("How many days you purchase in advance? ");
		int day = scan.nextInt();
		scan.nextLine();
		AdvanceTicket ticket = new AdvanceTicket(day);
		System.out.println(ticket);
	}
	public static void studentAdvanceTicket()
	{
		System.out.println("Enter your student ID: ");
		String studentID = scan.nextLine();
		System.out.println("How many days you purchase in advance? ");
		int day = scan.nextInt();
		scan.nextLine();
		StudentAdvanceTicket ticket = new StudentAdvanceTicket(day);
		ticket.setStudentID(studentID);
		System.out.println(ticket);
	}
}