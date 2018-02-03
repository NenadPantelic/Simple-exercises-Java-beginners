import java.util.*;
class Main {
	public static String keepVowels(String s)
	{
	  String vowelString = "";
		 List<String> vowels = new ArrayList<String>();
		 vowels.add("a");
		 vowels.add("e");
		 vowels.add("i");
		 vowels.add("o");
		 vowels.add("u");
		 
		 for (int i  = 0;i<s.length();i++)
		  if (vowels.contains(s.substring(i,i+1))) vowelString += s.substring(i,i+1);
		return vowelString;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(keepVowels("hello")); //eo
		System.out.println(keepVowels("how do i internets")); //ooiiee
	}
}
