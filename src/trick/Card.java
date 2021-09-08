package trick;

public class Card 
{
	// Attributes
	private int number;
	private String suit;
	private int id;
	private static int sourceID = 0;
	
	// Constructors
	
	/**
	 * This Constructor is the primary constructor for the Card class
	 * it allows you to blaha, blahm, blah....
	 * 
	 * @param n - The number for the card to hold
	 * @param s - The suit of the card
	 */
	public Card (int n, String s)
	{
		
		number = n; // THIS IS RIGHT!!!!
		suit = s;
		
		sourceID++;
		id = sourceID;
	}

	
	// Methods
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * This is a compare method for instances of Card. 
	 * Pass the second Card to this method.
	 * 
	 * @param other - The Card to compare to
	 * @return boolean identifying if the number and suit 
	 * 		   match between the two Card instances
	 */
	public boolean equals(Card other)
	{
		return this.number == other.number && this.suit.equals(other.suit);
	}
	
	@Override
	public String toString()
	{
		return number+suit;
	}
	
}
