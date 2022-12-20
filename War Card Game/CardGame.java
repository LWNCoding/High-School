import java.util.ArrayList;
public class CardGame{
  public static void CardGame(String[] args) {
    System.out.println("Hello and welcome war.");
    Deck a1 = new Deck();
    a1.shuffleDeck();
    a1.shuffleDeck();
    a1.shuffleDeck();


    ArrayList<Card> player1 = new ArrayList<Card>();
    ArrayList<Card> player2 = new ArrayList<Card>();
    for(int c = 51; c > 0; c-=2){
      player1.add(a1.getTopCard());
      player2.add(a1.getTopCard());
    }       

  }
}
