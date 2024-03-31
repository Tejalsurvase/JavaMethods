import java.util.Scanner ;
class Even
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the starting number :") ;
        int start = sc.nextInt() ;

        System.out.println("Enter the ending number :") ;
        int end = sc.nextInt() ;

        System.out.println("The even numbers are :") ;
		while (start <= end)
		{
			if (even(start))
			{
				System.out.println(start) ;
			}
			start++ ;
		}

	}

	public static boolean even(int num)
	{
		if (num % 2 == 0)
		{
			return true ;
		}
		return false ;
	}
}
