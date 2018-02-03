import java.util.Scanner;
import java.util.HashMap;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    int length = word.length();
    char vowel[] = {'a','e','i','o','u'};
    List<Character> list = new ArrayList<Character>();
    for (char c:vowel) list.add(c);
    for (int i = 0;i<length;i++)
      if (list.contains(word.charAt(i)))
        System.out.print(word.charAt(i));
  }
}
