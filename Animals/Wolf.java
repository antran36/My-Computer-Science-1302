	// This class demonstrates the movements of the Wolf
	public class Wolf extends Animals implements Actions
	{
	private static int n=0;
	public Wolf()
	{
		super("Wolf");
	}
		
	
	// Wolf move east 3 steps, west 3 steps, west 3 steps, east 3 steps (moving around the origin on the east-west direction with the range of 2)
	public void Move()
	{
		if(n%4==0)
		{
			super.getPosition().moveEast(3);
			
		}
		if(n%4==1)
		{
			super.getPosition().moveWest(3);
			
		}
		if(n%4==2)
		{
			super.getPosition().moveWest(3);
			
		}
		if(n%4==3)
		{
			super.getPosition().moveEast(3);
			
		}
			n++;
			System.out.println("Wolf moves to " + super.getPosition());
	}
	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Wolf is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		n=0;
	}
	public String toString()
	{
		return "W";
	}
}