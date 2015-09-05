/*Project 5: For this challenge you will be adding up all the numbers from 1 to a certain argument.
 * Author: Akiko Iwamizu
 * Language: JAVA
 * Details:
	1. Using the Java language, have the function SimpleAdding(num) add up all the numbers from 1 to num. 
	2. For the test cases, the parameter num will be any number from 1 to 1000.
*/

import java.util.Scanner;

class Function
{
	private int SimpleAdding(int num)
	{
		int n = 0;
		for(int i = 0; i <= num; i++)
			n += i;
		return n;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter a number here: ");
		Scanner s = new Scanner(System.in);
		Function f = new Function();
		System.out.println(f.SimpleAdding(s.nextInt()));
	}
}
 
