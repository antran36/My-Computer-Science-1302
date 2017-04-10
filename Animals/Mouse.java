// This class demonstrates the movements of the Mouse
public class Mouse extends Animals implements Actions
{
	private static int n=0;
	public Mouse()
	{
		super("Mouse");
	}
	// Mouse moves west 1 step, and north 1 step each time repeatedly
	public void Move()
	{
		if(n%2==0) //when the remainder is 0 move West
		{
			super.getPosition().moveWest(1);
			
		}
		if(n%2==1) // when the remainder is 1 move North
		{
			super.getPosition().moveNorth(1);
			
		}
		n++; //increase the count
		System.out.println("Mouse moves to " + super.getPosition() );
	}
	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Mouse is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		n=0;
	}
	public String toString()
	{
		return "M";
	}
}