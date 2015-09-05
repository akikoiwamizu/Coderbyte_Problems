/*Project 4: Manipulate characters in a string based off their positions in the alphabet.
 * Author: Akiko Iwamizu
 * Language: JAVA
 * Details:
	1. Using the Java language, have the function LetterChanges(str) take the str parameter 
		being passed and modify it using the following algorithm.
	2. Replace every letter in the string with the letter following it in the alphabet 
		(ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) 
		and finally return this alteredString string. 
*/

import java.util.Scanner;

class Proj4
{
	String LetterChanges(String str)
	{
		String alteredString = "";
		
		for(int i = 0; i < str.length(); i++)
		{
			// If letter (A-Y, a-y), then increment
			if((str.charAt(i) < 122) && (str.charAt(i) > 96))
				alteredString += (char) (str.charAt(i) + 1);
			// If z, then change to a
			else if((int) str.charAt(i) == 122)
				alteredString += (char) 97;
			// If Z, then change to A
			else if((int) str.charAt(i) == 96)
				alteredString += (char) 97;
			else 
				alteredString += str.charAt(i);
		}
		
		// Capitalize all vowels in string
		str = alteredString.replaceAll("a" ,"A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o","O").replaceAll("u", "U");
		
		return str;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a string here: ");
		Scanner s = new Scanner(System.in);
		Proj4 p4 = new Proj4();
		System.out.println(p4.LetterChanges(s.nextLine()));
	}
}
