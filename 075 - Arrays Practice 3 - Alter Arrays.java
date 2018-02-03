class Main
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		mystery(a);
		for(int e : a)
		{
			System.out.print(e + " ");
		}
		// should print out 10 1 30 2 50
	}
	public static void mystery(int[] array)
	{
		for(int i = 0; i<array.length; i++){
		  if (array[i] % 2 == 0) array[i] /= 2;
		  else array[i] *= 10;
		}
	}
}
