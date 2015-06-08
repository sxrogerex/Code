package question6;

/**
 * Created by jjchen on 2015/5/19.
 */
public class Test {
	
    public static void main(String[] args) {
        Dealer d = new Dealer();
        System.out.println("=====before shuffle=====");
        printCards(d.getDeck());
        System.out.println("=====after shuffle=====");
        d.shuffle();
        printCards(d.getDeck());
        Player[] players = d.dealing();
        System.out.println("=====after dealing=====");
        for (int i = 0; i < players.length; i++) {
            System.out.println();
            System.out.println("Player " + i + "");
            printCards(players[i].getCards());
            players[i].sort();
            System.out.println("--");
            printCards(players[i].getCards());
        }
    }

    private static void printCards(Card[] cards) {
        for (Card c : cards) {
            if (c != null) {
                System.out.println(c.toString());
            } else {
                System.out.println("null");
            }
        }
    }
}
