import java.util.Scanner ;
class SmithNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		int sumOfIp = sumOfDigits(ip) ;

		int ans = 0 ;
		while (ip > 1)
		{
			int factor = factor(ip) ;
			ip /= factor ;

			if (prime(factor))
			{
				ans = ans + sumOfDigits(factor) ;
			}
		}

		if (sumOfIp == ans)
		{
			System.out.println("Smith Number.") ;
		}
		else
		{
			System.out.println("Not a Smith Number.") ;
		}
	}

	public static int factor(int num)
	{
		int i ;
		for (i = 2; i <= num; i++)
		{
			if (num % i == 0)
			{
				break ;
			}
		}
		return i ;
	}

	public static int sumOfDigits(int num)
	{
		int sum = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			sum += i % 10 ;
		}
		return sum ;
	}

	public static boolean prime(int num)
	{
		for (int den = 2; den <= num / 2; den++)
		{
			if (num % den == 0)
			{
				return false ;
			}
		}
		return true ;
	}
}
