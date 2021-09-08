package trick;

import java.util.ArrayList;
import java.util.Collections;

public class Deck 
{
	private ArrayList<Card> deck; 
	
	public Deck()
	{
		deck = new ArrayList<Card>();
		
		for(int i = 1; i <= 13; i++)
		{
			deck.add(new Card(i, String.valueOf('\u2660') ));
			deck.add(new Card(i, String.valueOf('\u2661')));
			deck.add(new Card(i, String.valueOf('\u2662')));
			deck.add(new Card(i, String.valueOf('\u2663')));
		}
		for(int i = 0; i < 7; i++)
		{
			Collections.shuffle(deck);
		}
		
	}
	
	public int cardCount()
	{
		return deck.size();
	}
	
	public Card drawCard()
	{
		return deck.remove(0);
	}
	

}
