import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String name = inp.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	if (name.equals("Chen")) System.out.println("teacher");
  	else System.out.println("student");
  	
  }
}
