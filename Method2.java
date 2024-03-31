import java.util.Scanner ;
class Method2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;

		reverse(ip) ;
	}

	public static void reverse(int num)
	{
		int rev = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			rev = rev * 10 + rem ;
		}
		System.out.println("The reverse of given number is :" + rev) ;

		pallindrom(num, rev) ;
	}

	public static void pallindrom(int num, int rev)
	{
		if(num == rev)
		{
			System.out.println("The given number is pallindrom.") ;
		}
		else
		{
			System.out.println("The given number is not a pallindrom.") ;
		}
	}
}
