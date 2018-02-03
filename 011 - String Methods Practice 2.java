import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	Scanner inp = new Scanner(System.in);
  	System.out.print("In:");
  	String str = inp.nextLine();
  	System.out.print("Start:");
  	int start = inp.nextInt();
  	System.out.print("End:");
  	int end = inp.nextInt();
    // Don't change the code above! Write your code below
    System.out.println("The substring of "+ str + " from "+start + " to "+ end +" inclusive is "+str.substring(start,end+1));   
    
  }
}
