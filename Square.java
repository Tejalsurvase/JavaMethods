class Square 
{
	public static void main(String[] args) 
	{
		square(10) ;
	}

	public static void square(int num)
	{
		for (int i = 0; i <= num; i++)
		{
			for (int j = 0; j <= num; j++)
			{
				System.out.print("*" + " ") ;
			}
			System.out.println() ;
		}
	}
}
