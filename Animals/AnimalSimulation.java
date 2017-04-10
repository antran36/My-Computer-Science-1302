import java.util.Scanner;
/** This program illustrates the game based on different movements of different Animals.
*/
public class AnimalSimulation
{	
	// Input all the animals we have
	public static Scanner scan = new Scanner(System.in);
	public static Bird bird = new Bird();
	public static Frog frog = new Frog();
	public static Mouse mouse = new Mouse();
	public static Rabbit rabbit = new Rabbit();
	public static Snake snake = new Snake();
	public static Turtle turtle = new Turtle();
	public static Wolf wolf = new Wolf();
	public static Animals[] animal = {wolf,snake,bird,turtle,rabbit,frog,mouse};
	public static void main(String[] args)

	{

	boolean quit = false;
	char choice ='a';
	printInstruction();
	while(!quit)
	{
		choice = scan.nextLine().charAt(0); //get Command from the users
		switch(choice)
		{
		case 'I':
		printInstruction();
		break;
		case 'B':
		bird.Move();
		check();
		break;
		case 'F':
		frog.Move();
		check();
		break;
		case 'M':
		mouse.Move();
		check();
		break;
		case 'V':
		rabbit.Move();
		check();
		break;
		case 'S':
		snake.Move();
		check();
		break;
		case 'T':
		turtle.Move();
		check();
		break;
		case 'W':
		wolf.Move();
		check();
		break;
		case 'L':
		printLocation();
		break;
		case 'Q':
		quit = true;
		break;

		

	}
	}
}	// print instructions
	public static void printInstruction()
	{
		System.out.println("\t I - To print the instruction.");
		System.out.println("\t B - To make Bird move.");
		System.out.println("\t F - To make Frog move.");
		System.out.println("\t M - To make Mouse move.");
		System.out.println("\t V - To make Rabbit move.");
		System.out.println("\t S - To make Snake move.");
		System.out.println("\t T - To make Turtle move.");
		System.out.println("\t W - To make Wolf move.");
		System.out.println("\t L - To print location of all animals");
		System.out.println("\t Q - To quit.");
	}
	// when 2 animals meet, this method determines which one wons.
	public static void fight(Animals a, Animals b)
	{
		System.out.println(a.getName()+ " has eaten " +b.getName());
		b.Dead();
	
	}
	// check if 2 animals are in the same location. If yes, determine which is eaten.
	public static void check()
	{ 
		for(int i=0; i< animal.length;i++)
		{
			for(int j=i+1; j<animal.length;j++){
				if(i!=j && animal[i].getPosition().equals(animal[j].getPosition())) 
				{
					System.out.println( animal[i].getName() +" and " +animal[j].getName() +" are in the same position");
					fight (animal[i], animal[j]);
				}

		}
			}
	}
	// print all Location of all of the number. 
	public static void printLocation()
	{
		for(int i=0; i< animal.length; i++)
		{
				System.out.println(animal[i].getName() +"\t" + animal[i].getPosition() );
		}
	}
	}
