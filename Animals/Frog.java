// This class demonstrates the movements of the Frog
public class Frog extends Animals implements Actions
{
	public Frog()
	{
		super("Frog");
		
	}	
	// Frog moves randomly 3 steps in one of four directions.
	public void Move()
	{
		super.getPosition().moveRandom(3);
		System.out.println("Frog moves to " + super.getPosition());
	}

	// when animal is dead, it moved back to the origin.
	public void Dead()
	{
		System.out.println("Frog is dead");
		super.setDead(true);
		super.getPosition().setX(0);
		super.getPosition().setY(0);
		
	}
	public String toString()
	{
		return "F";
	}
}