import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    int length = word.length();
    for (int i = 0;i<length;i++) System.out.println(word.charAt(i));
    
  
}
}
