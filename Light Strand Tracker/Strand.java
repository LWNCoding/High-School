import java.util.ArrayList;

public class Strand{
  //makes strand arraylist
  ArrayList<Light> strand = new ArrayList<Light>(); 
  //default strand constructor
  public Strand(){ 
    strand.add(new Light());
  }
  //makes default light n(given) times 
  public Strand(int n){
    if(n <= 0){ 
      strand.add(new Light());
    }
    else{
      for(int x = 0; x < n; x++){
        strand.add(new Light());
      }
    }
  }
  //sets color of every light in strand to c
  public void setColor(String c){
    for(Light x : strand){
      x.setColor(c);
    }
  }
  //sets lights in strand to match "red", "green", "blue" light color pattern
  public void setMulti(){
    String [] hold = {"red","green","blue"};
    int x = 1;
    for(Light z : strand){
      if(x % 3 == 1){
        z.setColor(hold[x - 1]);
      }
      else if(x % 3 == 2){
        z.setColor(hold[x - 1]);
      }
      else if(x % 3 == 0){
        z.setColor(hold[x - 1]);
        x = 0;
      }  
      x++;
    }
  }
  //turns on all lights in array/strand
  public void turnOn(){ 
    for(Light b : strand){
      b.flip();
    }
  }
  //turns off all lights in array/strand
  public void turnOff(){ 
    for(Light c : strand){
      c.flip();
    }
  }
  //turns off light at index i in strand
  public void burnOut(int i){
    int x = 0;
    for(Light z : strand){
      if(x == i){
        z.burnOut();
      }
      x++;
    }
  }
  //gets size of strand
  public int getSize(){
    return strand.size();
  }

  //prints lights in strand line by line
  public String toString(){
    String x = "";
    for(Light a : strand){
      x+= a.toString() + "\n";
    }
    return x;
  }
}

