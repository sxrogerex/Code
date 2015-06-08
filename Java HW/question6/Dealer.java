package question6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by heisenberg on 2015/5/19.
 */
public class Dealer {
	private Card[] deck = new Card[52];

	public Dealer() {
		deck = initDeck();
	}

	/*
	 * Please implement method initDeck for 52 cards,
	 * 
	 * For now, we only have 6 cards in the following example and have 46 cards
	 * to go. Try to find a "smart way"(for loop or something else) to fill the
	 * deck instead of copying and pasting.
	 */
	private Card[] initDeck() {
		Card[] deck = new Card[52];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card(Card.suits[i % 4], Card.faces[i / 4]);
		}
		return deck;
	}

	/*
	 * Please implement shuffle method for deck field,
	 * 
	 * Randomly shuffle deck when method shuffle being called.
	 */
	public void shuffle() {
		Card[] tempDeck = new Card[52];
		for (int i = 0; i < tempDeck.length; i++) {
			int x = (int) (Math.random() * tempDeck.length);
			if (Arrays.asList(tempDeck).contains(deck[x])) {
				i--;
			} else {
				tempDeck[i] = deck[x];
			}

		}
		for (int i = 0; i < tempDeck.length; i++) {
			deck[i] = tempDeck[i];
		}

	}

	/*
	 * Please implement dealing method.
	 */
	public Player[] dealing() {
		Player[] players = new Player[4];
		for (int i = 0; i < players.length; i++) {
			Card[] cards = new Card[13];
			// filling cards here.
			for (int j = 0; j < cards.length; j++) {
				cards[j] = deck[i + players.length * j];
			}

			players[i] = new Player(cards);
		}
		return players;
	}

	public Card[] getDeck() {
		return deck;
	}
}
