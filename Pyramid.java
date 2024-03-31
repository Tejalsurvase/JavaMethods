class Pyramid
{
	public static void main(String[] args)
	{
		pyramid(20) ;
	}

	public static void pyramid(int num)
	{
		for (int i = 0; i < num; i++)
		{
			for (int space = 0; space < num - i - 1; space++)
			{
				System.out.print(" ") ;
			}
			for (int star = 0; star < 2 * i + 1; star++)
			{
				System.out.print("*" + " ") ;
			}

			System.out.println() ;
		}
	}
}