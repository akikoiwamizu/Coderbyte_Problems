//Project 2: For this challenge you will be determining the factorial for a given number.
//Author: Akiko Iwamizu
//Language: JAVA

import java.util.Scanner;

class Factorial
{
	private int getFactorial(int f)
	{
		int factorial = 1;
		for(int i = f; i > 0; i--)
		{
			factorial *= i;
		}
		return factorial;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a number here:");
	    Scanner  s = new Scanner(System.in);
	    Factorial f = new Factorial();
	    System.out.print(f.getFactorial(s.nextInt())); 
	}
}