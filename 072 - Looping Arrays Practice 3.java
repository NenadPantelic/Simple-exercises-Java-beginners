class Main
{
	public static String[] combineNames(String[] first_names, String[] last_names)
	{
		String names[] = new String[first_names.length];
		for (int i = 0; i < first_names.length; i++) names[i] = first_names[i] + " " + last_names[i];
		return names;
	}
	
	public static void main(String[] args)
	{
		//feel free to test code here
	}
}
