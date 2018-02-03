class Main
{
	public static double[] timesTen(double[] arr)
	{
		for(int el = 0; el < arr.length; el++) arr[el] *= 10;
		return arr;
	}
	
	public static void main(String[] args)
	{
		//feel free to test code here
		double arr[] ={1.0,2.0,3.0,4.0,5.0};
		arr = timesTen(arr);
		for(double el:arr) System.out.println(el);
	}
}
