package trick;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> hand;
	
	public Player(String n)
	{
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void removeCard(Card c)
	{
		hand.remove(c);
	}
	public Card removeCard(int c)
	{
		return hand.remove(c);
	}
	
	
	public ArrayList<Card> getHand() {
		return hand;
	}

	public void addToHand(Card c) {
		this.hand.add(c);
	}
	
	
	
}
