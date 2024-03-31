import java.util.Scanner ;
class RotationOfNumber 
{
	public static void main(String[] args) 
	{
	    //System.out.println(rotate(1234)) ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int ip = sc.nextInt() ;
		
		for (int i = 0; i < count(ip); i++)
		{
			System.out.println(rotate(ip)) ;
			ip = rotate(ip) ;
		}
	}

	public static int count(int num)
	{
		int ct = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			ct++ ;
		}
		return ct ;
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

	public static int rotate(int num)
	{
		int last = num % 10 ;

		num /= 10 ;

		int count = count(num) ;

		int ans = last * power(10, count) + num ;

		return ans ;

		//return (num % 10) * power(10, count(num) - 1) + num / 10 ;
	}
}
