import java.util.Scanner ;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter starting number :") ;
		int start = sc.nextInt() ;

		System.out.println("Enter ending number :") ;
		int end = sc.nextInt() ;

		System.out.println("The leap years from given range :") ;

		int count = 0 ;

		while (start <= end)
		{
			if (leap(start))
			{ 
				System.out.println(start) ;
				count++ ;
			}
			start++ ;
		}
		System.out.println("The total leap years are :" + count) ;
	}

	public static boolean leap(int year)
	{
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ;
	}
}
