package craps;
import java.util.Scanner;
public class CrapsGame2 
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		System.out.println("Hello what is your name?");
		String name = userInput.nextLine();
		System.out.println("Welcome To the game of craps "+ name +"!");
		
		
		{
			int dieRoll = (int)(Math.random()*6)+1;
			int dieRoll2 = (int)(Math.random()*6)+1;
			int totalDie = dieRoll + dieRoll2; 
			System.out.println("You Rolled "+dieRoll+"and a "+dieRoll2+" for a total of "+totalDie);

			if(totalDie == 7 || totalDie == 11)
			{
				System.out.println("You won " + name + "!");
				
			}
			else if(totalDie==2||totalDie==12)
			{
				System.out.println("You lost " + name + " sorry!");
				
			}
			else
			{
				System.out.println(totalDie + " is now the point");
				int point = totalDie;
				int pointDie1 = (int)(Math.random()*6)+1;
				int pointDie2 = (int)(Math.random()*6)+1;
				int pointDieTotal = pointDie1+pointDie2;
				System.out.println("You Rolled a " + pointDieTotal);
				if(pointDieTotal==point)
				{
					
					System.out.println("You won "+ name + "!");
				}
				else if(pointDieTotal==7)
				{
					
					System.out.println("Sorry " + name + " you lost");
				}
				else
				{
					while(pointDieTotal!=point && pointDieTotal!=7)
				{
					pointDie1 = (int)(Math.random()*6)+1;
					pointDie2 = (int)(Math.random()*6)+1;
					pointDieTotal = pointDie1+pointDie2;
					System.out.println("You Rolled a " + pointDie1 + "and a " + pointDie2 + " for a total of "+pointDieTotal);
					
				}
					if(pointDieTotal==point)
					{
						System.out.println("You won " + name + "!");
					}
					else if(pointDieTotal==7)
					{
						System.out.println("Sorry " + name + " you lost");
					}
				}
				
			}
		}
	}


	}

