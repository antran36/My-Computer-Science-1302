// This class demonstrates the movements of the Turtle
public class Turtle extends Animals implements Actions
{
	private static int n=0;
	public Turtle()
	{
		super("Turtle");
	}
		
	// Turtle moves south 5 steps, west 5 steps, north 5 sptes, east 5 steps each time repeatedly.
	public void Move()
	{
		if(n%4==0)
		{
			super.getPosition().moveSouth(5);
			
		}
		if(n%4==1)
		{
			super.getPosition().moveWest(5);
		}
		if(n%4==2)
		{
			super.getPosition().moveNorth(5);
			
		}
		if(n%4==3)
		{
			super.getPosition().moveEast(5);
			
		}
			n++;
			System.out.println("Turtle moves to " + super.getPosition());
	}
	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Turtle is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		n=0;
	}
	public String toString()
	{
		return "T";
	}
}