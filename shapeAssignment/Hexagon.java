// this class describes the hexagon and calculate area and perimeter of the shape.
import java.lang.Math;
public class Hexagon implements Shape
{
	private double side;
	public Hexagon(double side)
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
	// find Perimeter
	public double getPerimeter()
	{
		return side*6;
	}
	// find Area
	public double getArea()
	{
		double area = (3*Math.sqrt(3)/2)*side*side;
		return area;
	}
}