package question6;

import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

/**
 * Created by jjchen on 2015/5/19.
 */
public class Card {
    public static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public static String[] faces = {"Ace", "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    private static List<String> suitsAsList = Arrays.asList(suits);
    private static List<String> facesAsList = Arrays.asList(faces);
    private String suit;
    private String face;


    /**
     * Card does not accept arbitrary values for suit and face.
     * face = "13" is not a legal statement here since "13" does not exist in faces(The static array)
     */
    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
        if (!suitsAsList.contains(suit) || !facesAsList.contains(face)) {
            throw new IllegalArgumentException("Invalid suit or face");
        }
    }

    public String getSuit() {
        return suit;
    }

    public String getFace() {
        return face;
    }

    /*return true if this is greater than c2 */
    public boolean compare(Card c2) {
    	/*方法一(較佳寫法)*/
    	return facesAsList.indexOf(this.face) < facesAsList.indexOf(c2.face) || facesAsList.indexOf(this.face) == facesAsList.indexOf(c2.face) && suitsAsList.indexOf(this.face) < suitsAsList.indexOf(c2.face)
       
        /*方法二(我第一個想到的方法)
           if (facesAsList.indexOf(this.face) < facesAsList.indexOf(c2.face)) {
            return true;
        }else if(facesAsList.indexOf(this.face) = facesAsList.indexOf(c2.face)){
        	if(suitsAsList.indexOf(this.face) < suitsAsList.indexOf(c2.face)){
        		return true;
        	}else{
        		return false;
        		}
        }else{
        return false;
        }
         */
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", face='" + face + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (face != null ? !face.equals(card.face) : card.face != null) return false;
        if (suit != null ? !suit.equals(card.suit) : card.suit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = suit != null ? suit.hashCode() : 0;
        result = 31 * result + (face != null ? face.hashCode() : 0);
        return result;
    }
}
