import java.util.Scanner ;
class KrishnaMurthyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		if (ip == sumOfFactorial(ip))
		{
			System.out.println("The given number is KrishnaMurthy Number.") ;
		}
		else
		{
			System.out.println("The given number is not a KrishnaMurthy Number.") ;
		}
	}

	public static int factorial(int num)
	{
		int fact = 1 ;
		for (int i = num; i != 0; i--)
		{
			fact *= i ;
		}
		return fact ;
	}

	public static int sumOfFactorial(int num)
	{
		int sum = 0;
		for (int i = num; i != 0; i /= 10)
		{
			sum += factorial(i % 10) ;
		}
		return sum ;
	}

}
