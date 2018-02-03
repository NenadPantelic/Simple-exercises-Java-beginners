class Main {
	public static int sumToX(int x)
	{
		int suma = 0;
		for (int i = 1; i<=x;suma += i,i++);
		return suma;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumToX(5)); //15
		System.out.println(sumToX(7)); //28
	}
}
