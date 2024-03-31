import java.util.Scanner ;
class ArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		if (isArmStrong(ip))
		{
			System.out.println("The given number is ArmStrong Number .") ;
		}
		else
		{
			System.out.println("The given number is not a ArmStrong Number .") ;
		}
	}

	public static int count(int num)
	{
		int count = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			count++ ;
		}
		return count ;
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

	public static boolean isArmStrong(int num)
	{
		int ct = count(num) ;
		int sum = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			sum += power(rem, ct) ;
		}
		return num == sum ;
	}
}
