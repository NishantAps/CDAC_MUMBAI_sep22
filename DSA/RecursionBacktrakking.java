class RecursionBacktrakking
{
	static void display(String str, String res)
	{
		if(str.length() == 0)   //Empty String
		{
			System.out.println(res);  
			return;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			char r1= str.charAt(i);     //A is selected in r1
			String r2= str.substring(0,i)+str.substring(i+1);        // it take 2 values(start and end) | it take B | 2nd take C
			display(r2, res+r1);           // All it print ABC
			
		}
	}
	
	public static void main(String args[])
	{
		String s= "ABC";
		display(s,"");
	}
}