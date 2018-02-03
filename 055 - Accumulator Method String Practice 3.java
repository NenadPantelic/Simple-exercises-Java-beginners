class Main {
	public static String censorLetter(String s,char ch) 
	{
		String newString = "";
		for(int i = 0; i < s.length(); i++ ){ 
		  if(s.charAt(i) == ch ) newString += "*";
		  else newString += s.charAt(i) + "";
		  }
		return newString;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(censorLetter("computer science",'e')); //"comput*r sci*nc*"
		System.out.println(censorLetter("trick or treat",'t')); //"*rick or *rea*"
	}
}
