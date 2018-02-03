import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
   	//write your code below
    int f0 = 0;
    int f1 = 1;
    int t;
    for (int i = 0;i<x;i++)
    {
      System.out.print(f0+ " ");
      t = f1;
      f1 += f0;
      f0 = t;
      
      
    }
   	
  }
  
  
}
