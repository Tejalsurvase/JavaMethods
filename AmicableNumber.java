import java.util.Scanner ;
class AmicableNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the first number :") ;
		int num1 = sc.nextInt() ;

		System.out.println("Enter the second number :") ;
		int num2 = sc.nextInt() ;

		if (num1 == sumOfDivisiors(num2) && num2 == sumOfDivisiors(num1))
		{
			System.out.println("Given number are friendly number.") ;
		}
		else
		{
			System.out.println("Given number is not a friendly number.") ;
		}
	}

	public static int sumOfDivisiors(int num)
	{
		int sum = 0 ;
		for (int i = 1; i < num ; i++)
		{
			if (num % i == 0)
			{
				sum += i ;
			}
		}
		return sum ;
	}
}
