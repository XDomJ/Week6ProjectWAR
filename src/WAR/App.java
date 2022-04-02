package WAR;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player P1 = new Player();
		Player P2 = new Player();
		
		//shuffle into draw
		deck.shuffle();
		for (int j = 0; j < 52; j++) {
			if (j % 2 == 0) {
				P1.draw(deck);
			} else
				P2.draw(deck);
		}
		//gameplay loop
		for (int j = 0; j < 26; j++) {
			int x = P1.flip(P1.hand).getValue();
			int y = P2.flip(P2.hand).getValue();
			if (x > y) {
				P1.incrementScore(P1.score);
				System.out.println("Point for " + P1.name);
			} else if (y > x) {
				P2.incrementScore(P2.score);
				System.out.println("Point for " + P2.name);
			} else {
				System.out.println("Draw");
			}
		}
		
		//results
		System.out.println(P1.name + " scored " + P1.score + " points.");
		System.out.println(P2.name + " scored " + P2.score + " points.");
		if (P1.score > P2.score) {
			System.out.println(P1.name + " Wins!");
		} else if (P2.score > P1.score) {
			System.out.println(P2.name + " Wins!");
		} else {
			System.out.println("Draw. Try again.");
		}
	}

}
