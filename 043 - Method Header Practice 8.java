class Main {
	public static String makeThreeSubstr(String word,int startIndex,int endIndex)
	{
		String sub = word.substring(startIndex,endIndex);
		sub += word.substring(startIndex,endIndex);
		sub += word.substring(startIndex,endIndex);
		return sub;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}
