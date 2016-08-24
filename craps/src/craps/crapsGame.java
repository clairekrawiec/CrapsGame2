
package craps;
import java.util.Scanner;

public class crapsGame
	{
		String name;

		public static void main(String[] args)
			{
				System.out.println(" Hello what is your name?");
				Scanner userInput = new Scanner(System.in);
				String name =userInput.nextLine();
				System.out.println("Welcome to the game of craps " + name );
				System.out.println("We will roll the dice for you");
				int randomNumber = (int)(Math.random() * 6) +1;
				int randomNumber2 = (int)(Math.random() * 6) +1;
				int totalDice = randomNumber + randomNumber2;
				System.out.println(totalDice);
				int thePoint = totalDice;
				if(totalDice == 7 || totalDice == 11)
					{
						System.out.println("You rolled a " + randomNumber + " and a " + randomNumber2 + " with a total of " + totalDice + ". You win " + name );
					}
				if (totalDice == 12 || totalDice == 2)
				{
					System.out.println("You rolled a " + randomNumber + " and a " + randomNumber2 + " with a total of " + totalDice + ". You loose, sorry" + name);
				}
				if (totalDice <= 6 || totalDice <= 10)
				{
					System.out.println();
				}
				
				
					
						
				
				
				

			}

	}
