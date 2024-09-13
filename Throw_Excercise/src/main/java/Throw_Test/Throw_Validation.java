package Throw_Test;

public class Throw_Validation {

	public static void main(String[] args) {
		 validate(16);  
	        System.out.println("rest of the code...");   
		
	}
public static void validate (int age)
{
	if (age<18)
	{
		throw new ArithmeticException("Person is not eligible to vote"); 
	}
	else
	{
		System.out.println("Candidate can vote" );
	}
}
}
