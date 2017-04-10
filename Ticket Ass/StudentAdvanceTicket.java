// Student advance ticket has a student ID as an extra field
public class StudentAdvanceTicket extends AdvanceTicket
{
		private String StudentID;
	public StudentAdvanceTicket(int daysInAdvance)
	{
		super(daysInAdvance);
		if(daysInAdvance >=10)
		{
		super.setPrice(15); // price is half of the advance ticket
		}
		 else 
		{
		super.setPrice(10); // price is half of the advance ticket
		}
}
	public void setStudentID(String StudentID)
	{
		this.StudentID = StudentID;
	}
	public String getStudentID()
	{
		return StudentID;
	}
	public String toString()
	{
		return ("Ticket number: " + super.getNumber() +". Price: " + super.getPrice()+ "Student ID is: " + this.StudentID);
}
}