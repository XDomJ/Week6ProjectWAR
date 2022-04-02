package WAR;

import java.util.*;

public class Player {
	List<Card> hand = new ArrayList<>(); 
	int score;
	String name;
	
	//constructor
	public Player() {
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a name for your player:");
		name = kb.next();
		score = 0;
	}
	//methods
	public void describe (String name, List<String> hand) {
		System.out.println("Player: " + name);
		System.out.println("Cards in hand: " + hand.toString());
	}
	
	public Card flip (List<Card> hand) {
		System.out.println(name + " flipped a " + hand.get(0).toString());
		Card flipped = hand.get(0);
		hand.remove(0);
		return flipped;
	}
	
	public void draw (Deck deck) {
			hand.add(deck.draw());			
		} 	
	
	public void incrementScore (int score) {
		this.score += 1;
	}
}
