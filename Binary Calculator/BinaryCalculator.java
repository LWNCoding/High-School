import java.util.Scanner;

class BinaryCalculator {
  public static int[] bin(int fullbin[], int num) {
    int mod = 128;
    int ind = 0;
    do {
      if (num == 2) {
        fullbin[6]++;
        mod = 0;
      } else if (num == 3) {
        fullbin[6]++;
        fullbin[7]++;
        mod = 0;
      } else if (num >= mod) {
        num -= mod;
        fullbin[ind]++;
      }
      ind++;
      mod = (int) (mod / 2);
    } while (mod > 0);
    return fullbin;
  }

  public static String printarray(int x[]) {
    String temp = "";
    for (int y : x) {
      temp += y + " ";
    }
    return temp;
  }

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("First number: ");
    int num1 = inp.nextInt();
    System.out.print("Second number: ");
    int num2 = inp.nextInt();
    if (num1 + num2 > 255) {
      System.out.print("Please enter two numbers that add up to 255 or less inclusive");
      System.out.print("First number: ");
      num1 = inp.nextInt();
      System.out.print("Second number: ");
      num2 = inp.nextInt();
    }
    int first[] = new int[8];
    int second[] = new int[8];
    int sum[] = new int[8];
    bin(first, num1);
    bin(second, num2);
    System.out.println(printarray(first));
    System.out.println(printarray(second));
    for (int x = first.length - 1; x >= 0; x--) {
      sum[x] += first[x] + second[x];
      if (sum[x] > 1) {
        sum[x] -= 2;
        sum[x - 1]++;
      }
    }
    System.out.println(printarray(sum));
  }
}