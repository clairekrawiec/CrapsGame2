package craps;
import java.util.Scanner;
public class Craps {
	static int dieRoll1;
	static int dieRoll2;
	static int totalDice;
	static int thePoint;
	static boolean flag = true;
	public static void main(String[] args)
	{
			
			thePoint=totalDice;	
			rollDice();
			greetUser();
			
			if(totalDice ==7 || totalDice == 11)
			{
				System.out.println("The point is" + thePoint + "!");
				System.out.println("you Win!");
				flag= false;
			}
			if(totalDice ==2 || totalDice == 12)
			{
				System.out.println("The point is " + thePoint + "!");
				System.out.println("You loose!");
				flag= false;
			}
			else
			{
				thePoint= totalDice;
						System.out.println("The point is " + thePoint + "!");
						
			}
			while(flag)
			{
				dieRoll1 = (int)(Math.random()*6)+1;
				dieRoll2 = (int)(Math.random()*6)+1;
				totalDice = dieRoll1+dieRoll2;
					
			
				if(totalDice > 7 || totalDice < 7)
				{
					System.out.println("you rolled a " + dieRoll1 + " and " + dieRoll2 + " for a total of " + totalDice);
				}
				else if(totalDice == 7)
				{
					System.out.println("You lost");
					flag=false;
				}
				else if(totalDice == thePoint)
				{
					System.out.println("you won!");
					flag=false;
				}
				dieRoll1 = (int)(Math.random()*6)+1;
				dieRoll2 = (int)(Math.random()*6)+1;
				totalDice = dieRoll1+dieRoll2;
					
				
					
			}
	}

	private static int rollDice()
	{
		 dieRoll1 =(int)(Math.random()*6)+ 1;
		 dieRoll2 =(int)(Math.random()* 6)+ 1;
		 totalDice= dieRoll1 + dieRoll2;
		return totalDice;	
	}
	private static void greetUser()
	{
		System.out.println("Hello, what is your name?");
		Scanner userInput = new Scanner (System.in);
		String name = userInput.nextLine();
		System.out.println("hello, " + name + " Welcome to Craps!");
	}
	
	

}
