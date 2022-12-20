class Main {
  public static void main(String[] args) {
  Strand a1 = new Strand(5);
  a1.setColor("red");
  System.out.println(a1);
  a1.setMulti();
  System.out.println(a1);
  a1.turnOff();
  System.out.println(a1);
  a1.turnOn();
  System.out.println(a1);
  a1.burnOut(3);
  System.out.println(a1);
  }
}