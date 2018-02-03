import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String word = inp.nextLine();
  	//DO NOT CHANGE ABOVE CODE!  Write your code below
  	int length = word.length();
  	
  	if (word.substring(length-2,length).equals("ey")) System.out.println("-eys");
  	else if (word.substring(length-1,length).equals("y")) System.out.println("-ies");
    else if (word.substring(length-3,length).equals("ife")) System.out.println("-ives");
    else System.out.println("-s");
  
}
}
