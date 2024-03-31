import java.util.Scanner ;
class HaeshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number");
		int ip = sc.nextInt() ;

		if (ip % sumOfDigit(ip) == 0)
		{
			System.out.println("Given number is Harshad Number.") ;
		}
		else
		{
			System.out.println("Given number is not a Harshad Number.") ;
		}
	}

	public static int sumOfDigit(int num)
	{
		int sum = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			sum += i % 10 ;
		}
		return sum ;
	}
}
