import java.util.Scanner;
import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
   	//write your code below
   	s = s.toLowerCase();
   	List<Character> letters = new ArrayList<Character>();
   	for(int i = 0;i<s.length();i++) 
   	  if(s.charAt(i) != ' ') letters.add(s.charAt(i));
   	char chars[] = new char[letters.size()];
   	for (int i = 0;i<letters.size();i++) chars[i] = letters.get(i);
   	
   	//letters.toArray(chars);
   	s = String.valueOf(chars);
    
   	System.out.println(checkPalindrome(s,0,s.length()-1));
   	
  }
  
  public static boolean checkPalindrome(String s,int start, int end){
    
    
    if (end-start == 0) return true;
    else
      return (s.charAt(start) == s.charAt(end) && checkPalindrome(s,start+1,end-1));
        
        
        
        
      }
    
    
  
}
