public class Main {
	public static int countString(String str,String toFind)
	{
		int count  = 0;
		String sub;
		int length = str.length(), sublength = toFind.length();
		for (int i = 0;i<length-sublength+1;i++){
		  sub = str.substring(i,i+sublength);
		  if (sub.equals(toFind)) count++;
		}
		return count;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countString("crazy crayfish crushing craniums", "cra")); //3
		System.out.println(countString("sometimes solutions dont come on time", "me")); //4
	}
}
