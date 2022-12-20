import java.io.*;
import java.util.*;
import java.util.Scanner;

class Transformations 
{
   public static void createBitmap(int a[], String twoD[][]) 
   {
     int count = 0;
     int counta = 0;
     int hold1 = 0;
     int hold2 = 0;
     if(a.length % 2 == 0){ //checks if even
       count++;
     }
     for(int l : a){ //checks if 0-9 elements
       if(l < 10 && l >= 0){
         counta++;
       }
     }
     if(counta == a.length){ //checks 0-9 elements in whole string
       count++;
     }
     if(count == 2){
       for(int x = 0; x < a.length; x += 2){ //changes - to * at given coordinates from a[]
         hold1 = a[x];
         hold2 = a[x + 1];
         twoD[hold1][hold2] = "*";
       }
     }
   }  

   public static void printTwoD(String twoD[][])
   {
     for(String [] a : twoD){ //prints twoD line by line (list by list)
       for(String l : a){
         System.out.print(l);
       }
       System.out.println();
     }
   }

   public static void flipHorizontal(String twoD[][])
   {
     String temp = ""; 
     for(String [] a : twoD){
      for(int x = 0; x < a.length / 2; x++){ 
        temp = a[x]; //stores item1 in temp
        a[x] = a[a.length - x - 1]; //changes item1 to item2 (item equal distance from other end)
        a[a.length - x - 1] = temp; //changes item2 to temp (item1)
      }
     }
   }
    
   public static void flipVertical(String twoD[][])
   {
     String [] temp = new String[twoD[0].length]; 
     for(int x = 0; x < twoD.length / 2; x++){
       temp = twoD[x]; //stores list1 in temp
       twoD[x] = twoD[twoD.length - 1 - x]; //changes list1 to list2 (list equal distance from oher end) 
       twoD[twoD.length - 1 - x] = temp; //changes list2 to temp (list1)
     }
   } 

   public static void reverse(String twoD[][]) 
   {
     for(int x = 0; x < twoD.length; x++){
       for(int i = 0; i < twoD[0].length; i++){
         if("*".equals(twoD[x][i])){ //checks if *
           twoD[x][i] = "-"; //changes to - if true
         }
         else{
           twoD[x][i] = "*"; //changes rest to -
         }
       }
     }
   } 

 public static void main(String arg[]) throws IOException
 {
  String [][] twoD = {{"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"},
                   {"-","-","-","-","-","-","-","-","-","-"}};
  int points[] = { 1, 1, 1, 3, 1, 4, 2, 1, 2, 2, 2, 5, 3, 1, 3, 6, 4, 0,
    4, 1, 4, 6, 4, 7, 5, 1, 5, 3, 5, 6, 6, 1, 6, 3, 6, 6, 7, 1, 7,
    3, 7, 6, 8, 1, 8, 2, 8, 3, 8, 4, 8, 5, 8, 6};
  
  createBitmap(points,twoD);
  printTwoD(twoD);
  
  System.out.println("after horizontal flip: ");
  flipHorizontal(twoD);
  printTwoD(twoD);

  System.out.println("after vertical flip: ");
  //flip back to original first
  flipHorizontal(twoD);
  flipVertical(twoD);
  printTwoD(twoD);

  System.out.println("after reverse flip: ");
  //flip back before reverse
  flipVertical(twoD);
  reverse(twoD);
  printTwoD(twoD);
}
}