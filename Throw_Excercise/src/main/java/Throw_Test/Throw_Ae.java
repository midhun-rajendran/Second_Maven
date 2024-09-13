package Throw_Test;

public class Throw_Ae {
	
	public static void main(String[] args)
	
	{
		try {
		System.out.println("result=" +Throw_Ae.divide(8,0) );
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("division by zero not possible" );
		}
	}
	public static int divide(int a, int b) throws ArithmeticException
	{
		int d=a/b;
		return d;
	}
}
