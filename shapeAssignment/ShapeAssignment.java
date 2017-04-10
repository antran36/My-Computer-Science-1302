import java.util.Scanner;
public class ShapeAssignment
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of one side of Octagon: ");
		int Octside = scan.nextInt(); // input side of octagon
		Octagon oct = new Octagon(Octside);
		System.out.println("Enter value of one side of Hexagon: ");
		int Hexside = scan.nextInt();
		Hexagon hex = new Hexagon(Hexside); // input side of hexagon 
		System.out.printf("Oct Area: %.2f, Oct Perimeter: %.2f ", oct.getArea(),oct.getPerimeter());
		System.out.println();
		System.out.printf("Hex Area: %.2f, Hex Perimeter: %.2f ", hex.getArea(),hex.getPerimeter());
		System.out.println();
	}
}