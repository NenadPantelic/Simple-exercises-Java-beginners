import java.util.*;
class Main {
	public static int countVowels(String s)
	{
	  int count = 0;
		 List<Character> vowels = new ArrayList<Character>();
		 vowels.add('a');
		 vowels.add('e');
		 vowels.add('i');
		 vowels.add('o');
		 vowels.add('u');
		 
		 for (int i  = 0;i<s.length();i++)
		  if (vowels.contains(s.charAt(i))) count++;
		return count;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
	}
}
