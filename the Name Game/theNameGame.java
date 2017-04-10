/*input
3
Bhuck
Lincoln
Chuck 
Y
2
Anna
Daniel
N

*/
import java.util.Scanner;

public class theNameGame
{
		private static Scanner in = new Scanner(System.in);
		public static void main(String[] args)

		{
			boolean flag = true;
			while(flag)
			{
			startGame();	
			int numberofPlayers = players();
			for(int i=0;i < numberofPlayers; i++)
			{
				String name =nameInput();
				boolean check = check(name);
				if(check)
				{
				displayGame(name);
				}
			}
				flag = endGame();

		}

		}
		
		public static void startGame()
		{
			System.out.println("Welcome to the name game....");
		}
		public static int players()
		{
			System.out.println("Please enter number of players: ");
			int noP = in.nextInt();
			return noP;
		}
		public static String nameInput()
		{
			System.out.println("Enter player name: ");
			String name = in.next();
			in.nextLine();
			return name;
		}
		public static boolean check(String name)
		{
			if( name.equals("Chuck") || 
				name.equals("Fitch")
			  )
			{
				System.out.println("Sorry, you can not use this name.");
				return false;
			}
			return true;
		}
		public static void displayGame(String name)
		{
			System.out.println(name +"!");
			String name1 = name.substring(checkVowels(name), name.length());
			String shortName = name1.toLowerCase();
			System.out.println(name +", " + name +" bo " + "B" + shortName +" Banana fanna fo " + "F" + shortName );
			System.out.println("Fee fy mo " + "M"+ shortName +", " + name);
		}

		public static int checkVowels(String name)
		{

			for(int i=0; i< name.length(); i++)
			{
				char letter = name.charAt(i);
				if(vowels(letter))

				{
					return i;
				}
			}
			return 0;
		}
		public static boolean vowels(char letter)
		{
			if( letter =='a' || letter == 'e'|| 
				letter =='i' || letter == 'o'||
				letter == 'u'|| letter =='A' || 
				letter == 'E'|| letter =='I' ||
				letter == 'O'|| letter == 'U')
			{
				return true;
			}
			return false;
		}
		public static boolean endGame()
		{
			System.out.println("Do you want to play again? Enter Y to continue and N to end game");
			char endLoop = in.next().charAt(0);
			if(endLoop == 'N')
			{
				System.out.println("Thank you for playing!");
				return false;
			}
			return true;
		}
}
