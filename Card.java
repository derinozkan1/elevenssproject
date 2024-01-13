import java.util.List;
import java.util.ArrayList;

public class Card {
  private String suit1;
  private String ranks;
  private int pValue;
  
    public Card(String cRank, String cSuit, int cPValue) {
      cSuit = suit1;
      cRank = ranks;
      cPValue = pValue;
    }

    public String suit() {
      return suit1;
    }

    public String rank() {
      return ranks;
    }

    // Accessor method to return point value.
    public int pointValue() {
      return pValue;
    }

    public boolean matches(Card otherCard) {
      if(otherCard.suit1.equals(this.suit1) && otherCard.rank().equals(this.ranks) && otherCard.pValue == this.pValue) {
        return true;
      }
        else
          return false;
      }
}
    

/**
 * cards contains all the cards in the deck.
 */

// * c. a method to test equality between two card objects; and d. the toString
// method to create a String that contains the rank, suit, and point value of
// the card object. The string should be in the following format: rank of suit
// (point value = pointValue)