import java.util.Scanner ;
class CircularPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		int temp = ip ;

		if (prime(ip))
		{
			ip = rotate(ip) ;
			while (ip != temp)
			{
				if (prime(ip))
				{
					ip = rotate(ip) ;
				}
				else
				{
					break ;
				}
			}
			if (ip == temp)
			{
				System.out.println("Circular prime number.") ;
			}
			else
			{
				System.out.println("Not a circular prime number.") ;
			}
		}
		else
		{
			System.out.println("Not a circular prime number.") ;
		}
	}

	public static int count(int num)
	{
		int ct = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			ct++ ;
		}
		return ct ;
	}

	public static int power(int base, int raise)
	{
		int pow = 1 ;
		for (int i = 0; i < raise; i++)
		{
			pow *= base ;
		}
		return pow ;
	}

	public static int rotate(int num)
	{
		int last = num % 10 ;
		num /= 10 ;
		int count = count(num) ;

		int ans = last * power(10, count) + num ;

		return ans ;
	}

	public static boolean prime(int num)
	{
		for (int den = 2; den <= num/2; den++)
		{
			if (num % den == 0)
			{
				return false ;			
			}
		}
		return true ;
	}

}
