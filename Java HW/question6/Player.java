package question6;

/**
 * Created by jjchen on 2015/5/19.
 */
public class Player {
	private Card[] cards;

	public Player(Card[] cards) {
		this.cards = cards;
	}

	public Card[] getCards() {
		return cards;
	}

	/**
	 * Please implement sort method for the cards field inside Player.
	 * */
	public void sort() {
		for (int i = this.cards.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (this.cards[j].compare(this.cards[j + 1])) {
					Card tmp = this.cards[j];
					this.cards[j] = this.cards[j + 1];
					this.cards[j + 1] = tmp;
				}
			}
		}
	}
}
