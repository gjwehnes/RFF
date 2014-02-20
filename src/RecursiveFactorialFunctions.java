public class RecursiveFactorialFunctions {

	//20 Feb 2014 0830h

	public static void main(String[] args) 
	{
		System.out.println(FactorialItterative(10));
		System.out.println(FactorialFrontRecursive(10));
		System.out.println(FactorialTailRecursive(10));

	}
	
	private static long FactorialItterative(int n)
	{
		long product = 1;
		
		for (int j = n; j > 1; j--)
		{
			product *= j;
		}
		
		return product;
	}
	
	private static long FactorialFrontRecursive(int n)
	{
		long factorialOfNMinusOne = 0;

		if (n < 0)
		{
			//factorial for negative values is undefined!
			 throw new IllegalArgumentException("The factorial function is not defined for negative numbers");
		}
		else if (n == 1 || n == 0)
		{
			return 1;
		}
		else
		{
			factorialOfNMinusOne = FactorialFrontRecursive(n - 1);
			return (factorialOfNMinusOne * n);
		}
	}
	
	private static long FactorialTailRecursive(int n)
	{

		if (n < 0)
		{
			//factorial for negative values is undefined!
			 throw new IllegalArgumentException("The factorial function is not defined for negative numbers");
		}
		else if (n == 1 || n == 0)
		{
			return 1;
		}
		else
		{
			return (n * FactorialTailRecursive(n - 1));
		}
	}
	

}
