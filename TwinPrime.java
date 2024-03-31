class TwinPrime 
{
	public static void main(String[] args) 
	{
		int n = 1000, i = 2 ; 
        int n1 = prime(i), n2 ;
		for (; i <= n; i = n2)
		{
			n2 = prime(i + 1) ;
			if (n2 - n1 <= 2)
			{
				System.out.println(n1 + "," + n2) ;
			}
			n1 = n2 ;
		}
	}

	public static int prime(int num)
	{
		int i = num, j ;
		while (true)
		{
			for (j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					break ;
				}
			}
			if (i == j)
			{
				break ;
			}
		}
		return i ;
	}
}
