import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String str = inp.nextLine();
    // Don't change the code above! Write your code below
    System.out.print("The first 3 letters of "+str+" is "+str.substring(0,3));

  }
}
