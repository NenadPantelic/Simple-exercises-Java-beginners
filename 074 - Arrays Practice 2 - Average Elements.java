class Main
{
	public static void main(String[] args)
	{
		int[] a = {2,7,3,8,4};
		System.out.println(avgElements(a)); //should print 4.8
	}
	public static double avgElements(int[] array)
	{
	  double sum = 0;
		for(int i:array) sum += i;
		return sum/array.length;
		
	}
}
