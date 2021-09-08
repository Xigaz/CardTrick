package trick;

import java.util.Random;
import java.util.Scanner;

public class Magician 
{
	String[] compliments = {
			"Well Done %s!",
			"If only the rest of the world was as good at things %s!",
			"Roses are Red, Violets are Blue, You don't suck so THANK YOU! %s",
			"Oh yeah, That's a great choice. %s!",
			"Dude! I was going to say that! %s."
	};
	String[] insults = {
			"Are your eye's broke?! Pick a listed number! _...",
			"Searching.... Nope. Looks like your brain IS gone, _!",
			"Darn _!",
			"1... 2... 3... 4..., Yeah... That wasn't one of them _!",
			"_!"
	};
	String[] nameCalling = {
				"Stupid Head", 
				"Twinkle", 
				"Beautiful Person", 
				"Sucker",
				"Cake Sniffer"
			};
	StringBuilder sb;
	Deck deck;
	Player player;
	
	public Magician(String n)
	{
		deck = new Deck();
		player = new Player(n);
		sb = new StringBuilder("");
		
	}
	
	public void startShow()
	{
		
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int action = 0;
		Card cardBeingShown = null;
		
		while(action != 4)
		{
			printMenu();
			action = input.nextInt();
			input.nextLine();
			switch(action)
			{
				case 1:
					cardBeingShown = deck.drawCard();
					System.out.printf("Your Card is: %s\n", cardBeingShown);
					break;
				case 2:
					if(cardBeingShown != null)
						player.addToHand(cardBeingShown);
					else
						System.out.print("Draw a card First!");
					break;
				case 3:
					System.out.println(player.getHand());
					break;
				case 4:
					sb.setLength(0);
					sb.append(
							compliments[(new Random()).nextInt(compliments.length)]
							);
//					sb.replace(sb.indexOf("_"), sb.indexOf("_")+1, 
//							nameCalling[rand.nextInt(nameCalling.length)]);
					
					System.out.printf(sb.toString(), nameCalling[rand.nextInt(nameCalling.length)]);
					break;
				default:
					sb.setLength(0);
					sb.append(insults[rand.nextInt(insults.length)]);
					sb.replace(sb.indexOf("_"), sb.indexOf("_")+1, 
							nameCalling[rand.nextInt(nameCalling.length)]);
					
					System.out.println(sb);
					
			}
			
		}

	}

	private void printMenu()
	{
		System.out.println("Pick an Action:");
		System.out.println("1) Draw Card");
		System.out.println("2) Add Card To Hand");
		System.out.println("3) Show Hand");
		System.out.println("4) Exit");
		System.out.print("> ");
	}
}