
class Main {
  public static String surroundStr(String s,String search_term)
	{
		String newString = "";
		int len = search_term.length();
		int i = 0;
		while (i < s.length()-len+1){
		  if (s.substring(i,i+len).equals(search_term)) {
		    newString += "(" + search_term + ")";
		    i += len;
		  }
		  else {
		    if ( i == (s.length() - len )){
		      newString +=  s.substring(i,i+len);
		      i += len-1;
		    }
		    else{
		      newString += s.charAt(i);
		      i++;
		    }
		  }    
		}
	  return newString;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(surroundStr("abcabcabc","abc")); //"(abc)(abc)(abc)"
		System.out.println(surroundStr("there, on planeth hoth","th")); //"(th)ere, on plane(th) ho(th)"
	  //System.out.println(surroundStr("velika kara redom kara i smara kako karata","kara"));
	  
	}
}
