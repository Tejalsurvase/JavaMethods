import java.util.Scanner ;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num = sc.nextInt() ;

		if (perfectSquare(num + 1))
		{
			System.out.println("The given number is Sunny Number.") ;
		}
		else
		{
			System.out.println("The given number is not a Sunny Number.") ;
		}
	}

	public static boolean perfectSquare(int num)
	{
		int i = 1 ;
		while (i < num)
		{
			if (num == i * i)
			{
		         return true ;
			}
			i++ ;
	    }
		return false ;
	}
}