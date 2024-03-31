import java.util.Scanner ;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting number :") ;
		int start = sc.nextInt() ;

		System.out.println("Enter the ending number :") ;
		int end = sc.nextInt() ;

		System.out.println("The prime numbers from " + start + " and " + end + " are :") ;

		while (start <= end)
		{
			if (prime(start))
			{
				System.out.println(start) ;
			}
			start++ ;
		}
	}

	public static boolean prime(int num)
	{
		for (int den = 2; den < num / 2; den++)
		{
			if (num % den == 0)
			{
				return false ;
			}
		}
		return true ;
	}
}
