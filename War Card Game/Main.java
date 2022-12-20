import java.util.ArrayList;
public class Main{
  public static void main(String[] args) {
    System.out.println("Hello and welcome to war.");
    Deck a1 = new Deck();
    a1.shuffleDeck();
    a1.shuffleDeck();
    a1.shuffleDeck();

    //System.out.println(a1);

    ArrayList<Card> player1 = new ArrayList<Card>();
    ArrayList<Card> player2 = new ArrayList<Card>();
    for(int c = 51; c > 0; c-=2){
      player1.add(a1.getTopCard());
      player2.add(a1.getTopCard());
    }       

    System.out.println("Starting hands:");
    System.out.println("Player 1: " + player1);
    System.out.println("Player 2: " + player2);

    int turn = 0;
    do{
      turn++;
      System.out.println("After turn " + turn + ":");
      System.out.println("Player 1: " + player1);
      System.out.println("Player 2: " + player2);
      if(player1.get(0).pointValue() > player2.get(0).pointValue()){
        Card hold1w = player2.get(0);
        player2.remove(0);
        Card hold2l = player1.get(0);
        player1.remove(0);
        player1.add(hold2l);
        player1.add(hold1w);
        System.out.println("Player 1 wins.");
      }
      else if(player1.get(0).pointValue() < player2.get(0).pointValue()){
        Card hold1l = player1.get(0);
        player1.remove(0);
        Card hold2w = player2.get(0);
        player2.remove(0);
        player2.add(hold2w);
        player2.add(hold1l);
        System.out.println("Player 2 wins.");
      }
      else{
        Card hold1t = player1.get(0);
        Card hold2t = player2.get(0);
        player1.remove(0);
        player2.remove(0);
        player1.add(hold1t);
        player2.add(hold2t);
        System.out.println("Tie.");
      }
    }while((!(player1.size() == 0 || player2.size() == 0))&& turn < 100);

    System.out.println("\nPlayer 1 has " + player1.size() + " cards.");
    System.out.println("Player 2 has " + player2.size() + " cards.");

    if(player1.size() == player2.size()){
      System.out.println("The game is a tie");
  	}
    else if(player1.size() > player2.size()){
		  System.out.println("Player 1 wins.");
  	}
    else{
      System.out.println("Player 2 wins.");
    }
  }
}
