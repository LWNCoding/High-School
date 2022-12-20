public class Light{
  private boolean on;
  private boolean burntOut;
  private String color;
//default light constructor
  public Light(){ 
    on = true;
    burntOut = false;
    color = "white";
  }
/*creates light with given o, b, and c variables. o sets if light is on, b if it is burnt out, and c 
is color*/
  public Light(boolean o, boolean b, String c){ 
    on = o;
    burntOut = b;
    if(burntOut == true){
      on = false;
    }
    if(c.equalsIgnoreCase("red") || c.equalsIgnoreCase("green") || c.equalsIgnoreCase("blue")){
     color = c.toLowerCase();
    }
    else{
      color = "white";
    }
  }
/*Prints out light. If burnt out it says the light is burnt out and off, otherwise it says it is on
and not burnt out*/
  public String toString(){
    String tempOn = "off";
    String tempBurnt = "not burnt out";
    if(on == true){
      tempOn = "on";
    }
    if(burntOut == true){
      tempBurnt = "burnt out";
      tempOn = "off"; 
      return (tempOn + " " + color + "\t" + tempBurnt);
    }
    return (tempOn + " " + color + "\t" + tempBurnt);
  }
//flips light to on if off and not burnt out, otherwise it flips to off if on
  public void flip(){
    if(on == true){
      on = false;
    }
    else if(on == false){
      on = true;
    }
    if(burntOut == true){
      on = false;
    }
  }
/*sets color to red, green, or blue if c is red, green, or blue while ignoring case, also stores c
in lower case. If c is not red, green, or blue ignoring case, it is set to white*/
  public void setColor(String c){
    if(c.equalsIgnoreCase("red") || c.equalsIgnoreCase("green") || c.equalsIgnoreCase("blue")){
     color = c.toLowerCase();
    }
    else{
      color = "white";
    }
  }
//checks if the light is on, if it is it returns true, otherwise false
  public boolean isOn(){
    if(on == true){
      return true;
    }
    return false;
  }
//makes light burn out and turns off lightbulb
  public void burnOut(){
    burntOut = true;
    on = false;
  }
//checks if the light is burnt out, if it is it returns true, otherwise false
  public boolean isBurntOut(){
    if(burntOut == true){
      return true;
    }
    return false;
  }
//gets color
  public String getColor(){
    return color;
  }
}