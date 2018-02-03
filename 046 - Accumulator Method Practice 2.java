class Main {
	public static int sumEvenToX(int x)
	{
		int suma = 0;
		for (int i = 0; i<=x;suma += i,i += 2);
		return suma;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(sumEvenToX(5)); //6
		System.out.println(sumEvenToX(8)); //20
	}
}
