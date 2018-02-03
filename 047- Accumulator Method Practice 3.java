class Main {
	public static int sumFivesRange (int a,int b)

	{
	  int suma = 0;
		int remainder = 5-(a%5);
		if (remainder != 5) a += remainder;
		for (int i = a; i<=b;suma += i,i+=5);
		return suma;
		
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumFivesRange(5,15)); //30
		System.out.println(sumFivesRange(11,28)); //60
	}
}
