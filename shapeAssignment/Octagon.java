// this class describes the octagon and calculate area and perimeter of the shape.
import java.lang.Math;
public class Octagon implements Shape
{
	private double side;
	public Octagon(double side)
	{
		this.side = side;
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side = side;
	}
	//find perimeter
	public double getPerimeter()
	{
		return side*8;
	}
	// find Area
	public double getArea()
	{
		double area = 2*(1+Math.sqrt(2))*side*side;
		return area;
	}
}