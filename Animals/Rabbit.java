// This class demonstrates the movements of the Rabbit
public class Rabbit extends Animals implements Actions
{
	private static int n=0;
	public Rabbit()
	{
		super("Rabbit");
	}
	
	// rabbit moves to the north 2 steps, east 2 steps, south 2 steps each time repeatedly
	public void Move()
	{
		if(n%3==0) 
		{
			super.getPosition().moveNorth(2);
		}
		if(n%3==1)
		{
			super.getPosition().moveEast(2);
		}
		if(n%3==2)
		{
			super.getPosition().moveSouth(2);
		}
		n++;
		System.out.println("Rabbit moves to " + super.getPosition() );
	}
	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Rabbit is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		n=0;
	}
	public String toString()
	{
		return "V";
	}
}