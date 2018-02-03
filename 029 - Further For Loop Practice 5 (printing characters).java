import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    //write your code below
    char chars[] = s.toCharArray();
    for (char c:chars) System.out.print(c+" ");
    
  }
}
