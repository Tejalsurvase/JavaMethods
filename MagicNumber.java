import java.util.Scanner ;
class MagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		if (magicNumber(ip) == 1)
		{
			System.out.println("The given number is Magic Number.") ;
		}
		else
		{
			System.out.println("The given number is not a Magic Number.") ;
		}
	}

	public static int magicNumber(int num)
	{
		int sum = 0 ;
		while (num != 0)
		{
			int rem = num % 10 ;
			num /= 10 ;
			sum = num + rem ;
		}
		return sum ;
	}
}
