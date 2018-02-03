class Main {
	public static String surround(String s,char search_term)
	{
		String newString = "";
		for( int i = 0; i < s.length(); i++){
		  if (s.charAt(i) == search_term) newString += "(" + s.charAt(i) + ")";
		  else newString += s.charAt(i);
	  }
	  return newString;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surround("abcabcabc",'c')); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology",'o')); //"techn(o)l(o)gy"
	}
}
