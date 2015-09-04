//Project: Determine if the input is a prime number or not
//Author: Akiko Iwamizu
//Language: JAVA

import java.util.Scanner;

class Primes
{
	private String isPrime(int p)
	{
		if(p == 0 || p == 1)
			return p + " is NOT a prime number.";
		if(p == 2)
			return p + " is a prime number.";
		if(p % 2 == 0)
			return p + " is NOT a prime number.";
		for(int i = 3; i * i <= p; i += 2)
		{
			if(p % i == 0)
				return p + " is NOT a prime number.";
		}
		return p + " is a prime number.";
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		Primes p = new Primes();
		System.out.println(p.isPrime(s.nextInt()));
	}
}