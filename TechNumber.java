import java.util.Scanner ;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		int digitcount = count(ip) ;

		if (digitcount % 2 == 0)
		{
			int den = power(10, digitcount / 2) ;

			int lasthalf = ip % den ;

			int firsthalf = ip / den ;

			int sum = lasthalf + firsthalf ;

			if (sum * sum == ip)
			{
				System.out.println("Tech Number.") ;
			}
			else
			{
				System.out.println("Not a tech number.") ;
			}
		}
		else
		{
			System.out.println("Not a tech number.") ;
		}
	}

	public static int count(int num)
	{
		int ct = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			ct++ ;
		}
		return ct++ ;
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
}
