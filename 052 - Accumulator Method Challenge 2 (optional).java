class Main {
	
	public static String alphabetical(String s)
	{
	  int j = 0;
		String newString = s.charAt(0)+"";
		for(int i = 1;i<s.length();i++)
		  if(s.charAt(i) >s.charAt(i-1) && s.charAt(i) > newString.charAt(j)){
		    j++;  
		    newString += s.charAt(i)+"";
		  }
		return newString;
		
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(alphabetical("adatplqzh")); //"adtz"
	}
}
