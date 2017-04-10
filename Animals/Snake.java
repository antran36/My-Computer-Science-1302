// This class demonstrates the movements of the Snake
public class Snake extends Animals implements Actions
{
	public static int n=0;
	public static int i=0;

	public Snake()
	{
		super("Snake");
	}
	// Snake moves south 1 step, east 1 step, south 1 step, west 2 steps (slithers left and right in an increase length)
	public void Move()
	{
		if(n%4==0)
		{
			super.getPosition().moveSouth(1);
			
		}
		if(n%4==1)
		{
			super.getPosition().moveEast(i+1);
			i++;
		}
		if(n%4==2)
		{
			super.getPosition().moveSouth(1);
		}
		if(n%4==3)
		{
			super.getPosition().moveWest(i+1);
			i++;
		}
		n++;

		System.out.println("Snake moves to " + super.getPosition());
	}
	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Snake is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		n=0;
		i=0;
	}
	public String toString()
	{
		return "S";
	}
}