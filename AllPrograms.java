import java.util.Scanner ;
class AllPrograms 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number :") ;
		int num1 = sc.nextInt() ;

		System.out.println("Enter the number :") ;
		int num2 = sc.nextInt() ;

		rev(num1) ;
		count(num1) ;
		posNeg(num1) ;
		leapOrNot(num1) ;
		extractDigit(num1) ;
		sumOfDigit(num1) ;
		spyNum(num1) ;
		factorial(num1) ;
		duckNum(num1) ;
		uniqueNum(num1) ;
		primeNum(num1) ;
		fabonacciNum(num1) ;
		factorsOfNum(num1) ;
		lcmOfNum(num1, num2) ;
		hcfOfNum(num1, num2) ;
		coPrimeNum(num1, num2) ;
	}

	public static void rev(int num)
	{
		int rev = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			rev = rev * 10 + i % 10 ;
		}
		System.out.println("The reverse of given number is :" + rev) ;

		pallindrom(num, rev) ;
	}
	
	public static void pallindrom(int num, int rev)
	{
		if (num == rev)
		{
			System.out.println("The given number is pallindrom number.") ;
		}
		else
		{
			System.out.println("The given number is not a pallindrom number.") ;
		}
	}

	public static void posNeg(int num)
	{
		if (num > 0)
		{
			System.out.println("The given number is positive number.") ;
		}
		else
		{
			System.out.println("The given number is negative number.") ;
		}
    }

	public static void count(int num)
	{
		int count = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			count++ ;
		}
		System.out.println("The count of given number is :" + count) ;

		primeNum(count) ;
	}

	public static void leapOrNot(int num)
	{
		if ((num % 100 == 0 && num % 4 == 0) || num % 400 == 0)
		{
			System.out.println("The given year is leap year.") ;
		}
		else
		{
			System.out.println("The given year is not a leap year.") ;
		}
	}

	public static void extractDigit(int num)
	{
		System.out.println("The digit of given number are :") ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			System.out.println(rem) ;
			factorial(rem) ;
		}
	}

	public static void sumOfDigit(int num)
	{
		int sum = 0 ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			sum += rem ;
		}
		System.out.println("The sum of digit of the given number is :" + sum) ;
	}

	public static void spyNum(int num)
	{
		int sum = 0, product = 1 ;
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			sum += rem ;
			product *= rem ;
		}
		if (sum == product)
		{
			System.out.println("The given number is Spy number.") ;
		}
		else
		{
			System.out.println("The given number is not a Spy number.") ;
		}
	}

	public static void factorial(int num)
	{
		int fact = 1;
		for (int i = num; i > 0; i--)
		{
			fact *= i ;
		}
		System.out.println("The factorial of given number is :" + fact) ;
	}

	public static void duckNum(int num)
	{
		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10 ;
			if (rem == 0)
			{
				break ;
			}
		}
		if (num == 0)
		{
			System.out.println("The given number is not Duck Number.") ;
		}
		else
		{
			System.out.println("The given number is Duck Number.") ;
		}
	}

	public static void uniqueNum(int num)
	{
		if (num % 7 == 0 || num % 10 == 7)
		{
			System.out.println("The given number is Unique number.") ;
		}
		else
	    {
			System.out.println("The given number is not Unique number.") ;
	    }
	}

	public static void primeNum(int num)
	{
		int denominator = 2 ;
		for (int den = denominator; den < num; den++)
		{
			if (num % den == 0)
			{
				break ;
			}
		}
		if (num == denominator)
		{
			System.out.println("The given number is Prime number.") ;
		}
		else
		{
			System.out.println("The given number is not a Prime number.") ;
		}
	}

	public static void fabonacciNum(int num)
	{
		int n1 = 0, n2 = 1, res ;
		while (true)
		{
			res = n1 + n2 ;
			if (num == n1)
			{
				System.out.println("The given number is in Fabonacci Series.") ;
			}
			else if(n1 > num)
			{
				System.out.println("The given number is not in Fabonacci Series.") ;
				break ;
			}
			n1 = n2 ;
			n2 = res ;
		}
	}

	public static void factorsOfNum(int num)
	{
		int den = 1 ;
		System.out.println("The factors of " + num + " are :") ;
		while (den <= num)
		{
			if (num % den == 0)
			{
				System.out.println(den) ;
			}
			den++ ;
        }
	}

	public static void lcmOfNum(int n1, int n2)
	{
		int large = n1 > n2 ? n1 : n2 ;
		int multiply = 1 ;
		int Lcm = large * multiply ;
		while (true)
		{
		   if (Lcm % n1 == 0 && Lcm % n2 == 0)
		   {
			   break ;
		   }
		   multiply++ ;
		}
		System.out.println("The LCM of " + n1 + " and " + n2 + "is :" + large) ;
	}

	public static void hcfOfNum(int num1, int num2)
	{
		int small = num1 < num2 ? num1 : num2 ;
		while (true)
		{
			if (num1 % small == 0 && num2 % small == 0)
			{
				break ;
			}
			small-- ;
		}
		System.out.println("The HCF of " + num1 + " and " + num2 + "is :" + small) ;
	}

	public static void coPrimeNum(int num1, int num2)
	{
		int small = num1 < num2 ? num1 : num2 ;
		while (true)
		{
			if (num1 % small == 0 && num2 % small == 0)
			{
				break ;
			}
			small-- ;
		}
		if (small == 1)
		{
			System.out.println("The given numbers are Co-Prime numbers.") ;
		}
		else
		{
			System.out.println("The given numbers are not Co-Prime numbers.") ;
		}
	}
}
