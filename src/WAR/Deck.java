package WAR;

import java.util.*;

public class Deck {
	//variables 
	List<Card> Cards = new ArrayList<>();
	private String[] suits = {"hearts", "clubs", "spades", "diamonds"};
	
	//constructor
	public Deck() {
		for (int j = 0; j < 4; j++) {
			for (int i = 2; i <= 14; i++) {
				Card a = new Card(i, suits[j]);				
				if(!Cards.contains(a)) {
					(Cards).add(a);
				}
			}
		}
	}
	//methods
	public List<Card> shuffle() {
		Collections.shuffle(Cards);
		return Cards;
	}
	
	public Card draw() {
		Cards.add(Cards.remove(0));
		return(Cards.get(51));
	}
}
