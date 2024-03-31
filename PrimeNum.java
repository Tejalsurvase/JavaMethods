import java.util.Scanner ;
class PrimeNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter starting number :") ;
		int start = sc.nextInt() ;

        System.out.println("Enter ending number :") ;
		int end = sc.nextInt() ;

		while (start <= end)
		{
			if (primeNum(start))
			{
				System.out.println(start) ;
			}
			start++ ;
		}
	}

	public static boolean primeNum(int num)
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
}
