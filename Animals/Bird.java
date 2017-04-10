// This class demonstrates the movements of the Bird
public class Bird extends Animals implements Actions
{
	public Bird()
	{
		super("Bird");
	}	

	// Birds move randomly one step in one of four directions.
	public void Move()
	{
		super.getPosition().moveRandom(1);
		System.out.println("Bird moves to " + super.getPosition());
	}

	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Bird is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		
	}
	public String toString()
	{
		return "B";
	}
}