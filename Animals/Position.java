// This class creates a x-y coordinate where x demonstrates the East-West movements of the animals and y demonstrates the South-North movements.

import java.lang.Math;
public class Position
{
	private int x;
	private int y;
	
	public Position()
	{
		this.x=0;
		this.y=0;
	}
	public Position(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	// Check if 2 positions are equal excepts when both 2 animals are at the origin.
	public boolean equals(Object o)
	{
		if(o instanceof Position)
		{
			Position other = (Position) o;
			return x== other.x && y==other.y && (x!=0 || y!=0 || other.x!=0 || other.y!=0);
		}
		else 
		{
			return false;
		}
	}
	// movements in different directions
	public void moveNorth(int step)
	{
		y=y+ step;
	}
	public void moveSouth(int step)
	{
		y= y-step;
	}
	public void moveEast(int step)
	{
		x= x+step;
	}
	public void moveWest(int step)
	{
		x=x-step;
	}
	// random move in different directions with a certain steps
	public void moveRandom(int step)
	{
		int randomNumber =(int) (1+ Math.random() *4 ); //generate a random integer number between 1 and 4
		switch(randomNumber)
		{
			case 1:
			moveNorth(step);
			break;
			case 2:
			moveSouth(step);
			break;
			case 3:
			moveEast(step);
			break;
			case 4:
			moveWest(step);
			break;
		}
	}
	public String toString()
	{
		return("(" +this.x +","+ this.y+")");
	}
}