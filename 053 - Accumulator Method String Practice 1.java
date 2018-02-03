class Main {
	public static String spaceOut(String s)
	{
		String newString = "";
		for(int i = 0; i < s.length(); i++) newString += s.charAt(i) + " ";
		return newString;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(spaceOut("hello")); //"h e l l o "
		System.out.println(spaceOut("technology")); //"t e c h n o l o g y "
	}
}
