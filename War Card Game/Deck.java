import java.util.ArrayList;
import java.lang.Math;

public class Deck{
  private ArrayList<Card> deck;

  public Deck(){
     deck = new ArrayList<Card>(52);
     String [] suit = {"heart","diamond", "spade", "club"};
     String [] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
     int [] points = {1,2,3,4,5,6,7,8,9,10,11,12,13};
     for(int a = 0; a < 4; a++){
       for(int c = 0; c < 13; c++){
         deck.add(new Card(suit[a],ranks[c],points[c]));
       }
     }
  }

  public void shuffleDeck(){
    ArrayList<Card> store = new ArrayList<Card>();
    for(int z = 51; z > 0; z--){
      int a = (int) (Math.random() * z);
      store.add(deck.get(a));
      deck.remove(a);
    }
    store.add(deck.get(0));
    deck = store;
  }

  public Card getTopCard(){
    Card store = deck.get(0);
    deck.remove(0);
    return store;
  }

  public String toString(){
    String hold = "";
    for(Card a : deck){
      hold += a.rank() + " of " + a.suit() + " ";
    }
    return hold;
  }
}