/*
 * Name: Liam Nicholson
 * Period: 7
 *
 * Assignment 3 
 * 
 * On my honor, by submitting this code I am claiming that it was written and tested by me.  
 * Any help I received was in the form of asking questions for clarification and no direct copying was done.
 * 
*/

import java.util.Scanner;
import java.lang.Math;
class Vigenere {
  public static void main(String[] args) {
    Scanner keynum = new Scanner(System.in);
    Scanner msgstring = new Scanner(System.in);
    String decoded = ""; 
    String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
    String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.print("Key for encryption:");
    String keyWord = keynum.nextLine();
    System.out.print("Message to encrypt:");
    String msg = msgstring.nextLine();
    int keycount = 0;
    for(int x = 0; x < msg.length(); x++){
      if(keycount > keyWord.length() - 1){
        keycount = 0;
      }
      char letter = msg.charAt(x); 
      int value = (int) letter; 
      int key = 0;
      if(value <= 90 && value >= 65){
        for(int a = 0; a < alphabetUpper.length(); a++){
          if(keyWord.charAt(keycount) == alphabetUpper.charAt(a)){
            key = a;
          }
        }
        for(int b = 0; b < alphabetLower.length(); b++){
          if(keyWord.charAt(keycount) == alphabetLower.charAt(b)){
            key = b;
          }
        }
        //System.out.println(key);
        int newvalue = value + key; 
        if(newvalue > 90){ 
          int r = newvalue - 90; 
          newvalue = 65 + r - 1; 
        }
        char nl = (char) newvalue; 
        decoded += nl; 
        keycount++;
      }
      else if(value <= 122 && value >= 97){
        for(int b = 0; b < alphabetLower.length(); b++){
          if(keyWord.charAt(keycount) == alphabetLower.charAt(b)){
            key = b;
          }
        }
        for(int c = 0; c < alphabetUpper.length(); c++){
          if(keyWord.charAt(keycount) == alphabetUpper.charAt(c)){
            key = c;
          }
        }
        //System.out.println(key);
        int newvalue = value + key; 
        if(newvalue > 122){ 
          int r = newvalue - 122; 
          newvalue = 97 + r - 1; 
        }
        char nl = (char) newvalue; 
        decoded += nl; 
        keycount++;
      }
      else{
      decoded += letter; 
      }
    }
    System.out.println("Your message is: " + decoded);

  }
}