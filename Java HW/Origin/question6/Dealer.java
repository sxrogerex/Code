package question6;

/**
 * Created by heisenberg on 2015/5/19.
 */
public class Dealer {
    private Card[] deck = new Card[52];

    public Dealer() {
        deck = initDeck();
    }

    /*
    *Please implement method initDeck for 52 cards,
    *
    * For now, we only have 6 cards in the following example and have 46 cards to go.
    * Try to find a "smart way"(for loop or something else) to fill the deck instead of copying and pasting.
    * */
    private Card[] initDeck() {
        Card[] deck = new Card[52];
        deck[0] = new Card(Card.suits[0], Card.faces[0]);
        deck[1] = new Card(Card.suits[1], Card.faces[0]);
        deck[2] = new Card(Card.suits[2], Card.faces[0]);
        deck[3] = new Card(Card.suits[3], Card.faces[0]);
        deck[4] = new Card(Card.suits[0], Card.faces[1]);
        deck[5] = new Card(Card.suits[1], Card.faces[1]);
        return deck;
    }

    /*
    * Please implement shuffle method for deck field,
    *
    * Randomly shuffle deck when method shuffle being called.
    *
    * */
    public void shuffle() {
        Card tmp = deck[0];
        deck[0] = deck[1];
        deck[1] = tmp;
    }

    /*
    * Please implement dealing method.
    * */
    public Player[] dealing() {
        Player[] players = new Player[4];
        for (int i = 0; i < players.length; i++) {
            Card[] cards = new Card[13];
            //filling cards here.
            players[i] = new Player(cards);
        }
        return players;
    }

    public Card[] getDeck() {
        return deck;
    }
}
