public class Animals
{
	private String name;
	private boolean dead;
	private Position position;
	public Animals(String name)
	{
		this.name = name;
		this.dead = false;
		this.position = new Position();
	}
	public Position getPosition()
	{
		return position;
	}
	public String getName()
	{
		return name;
	}
	public void setDead(boolean value)
	{
		this.dead = value;
	}
	public void Dead()
	{

	}

}