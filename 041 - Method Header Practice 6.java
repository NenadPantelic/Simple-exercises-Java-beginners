class Main {
  public static boolean bothEven(int num1,int num2)	
	{
		return (num1%2 == 0 && num2%2 == 0);
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(bothEven(8,6)); //should be true
		System.out.println(bothEven(5,6)); //should be false
	}
}
