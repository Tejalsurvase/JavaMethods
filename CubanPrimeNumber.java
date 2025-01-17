class CubanPrimeNumber 
{
	public static void main(String[] args) 
	{
		int ip = 100 ;
		for (int i = 1; i <= ip; i++)
		{
			if (isCubanPrime(i))
			{
				System.out.println(cubanFormula(i)) ;
			}
		}
	}

	public static int cube(int num)
	{
		return num*num*num ;
	}

	public static boolean prime(int num)
	{
		for (int den = 2; den < num/2; den++)
		{
			if (num % den == 0)
			{
				return false ;
			}
		}
		return true ;
	}

	public static int cubanFormula(int num)
	{
		return cube(num + 1) - cube(num) ;
	}

	public static boolean isCubanPrime(int num)
	{
		return prime(cubanFormula(num)) ;
	}
}
