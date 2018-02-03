import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
    //write your code below
    for (int i = 0;i<x;System.out.print(i+" "),i+=3); 
    
  }
}
