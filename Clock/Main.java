import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);

		// time 1
		Time t1 = new Time(14, 56);
		System.out.println("time1: "+ t1);
      System.out.println("convert time1 to standard time: "+ t1.convert());
		System.out.println("time1: "+ t1);
      for (int i = 0; i<5; i++)
         t1.increment();
		System.out.println("Increment time1 five times: "+ t1);
      System.out.println();
      
		Time t2 = new Time(0, 12);
		System.out.println("time2: "+ t2);
      for (int i = 0; i<67; i++)
         t2.increment();
		System.out.println("Increment time2 67 times: "+ t2);
      System.out.println("convert time2 to standard time: "+ t2.convert());
		System.out.println("time2: "+ t2);
      System.out.println();
      
      Time t3 = new Time(5, 17);
		System.out.println("time3: "+ t3);
      System.out.println("convert time3: "+ t3.convert());
		System.out.println();

      Time t4 = new Time(12, 15);
		System.out.println("time4: "+ t4);
      System.out.println("convert time4: "+ t4.convert());
		System.out.println();
      
      Time t5 = new Time(0, 15);
		System.out.println("time5: "+ t5);
      System.out.println("convert time5: "+ t5.convert());
		System.out.println();

      Time t6 = new Time(23, 59);
		System.out.println("time6: "+ t6);
      System.out.println("convert time6: "+ t6.convert());
      t6.increment();
		System.out.println("Increment time6: "+ t6);
      System.out.println("convert time6: "+ t6.convert());
      System.out.println();
      
      	Time t7 = new Time(7, 47);
		System.out.println("time7: "+ t7);
      System.out.println("convert time7 to standard time: "+ t7.convert());
		System.out.println("time7: "+ t7);
      for (int i = 0; i<2752; i++)
         t7.increment();
		System.out.println("Increment time7 43 times: "+ t7);
      System.out.println();
      System.out.println("convert time7 to standard time: "+ t7.convert());
  }
}