//Project 3: For this challenge you will be determining the largest word in a string.
//Author: Akiko Iwamizu
//Language: JAVA

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Word
{
	private String LongestWord(String str)
	{
		String longestWord = "";
		ArrayList<String> words = new ArrayList<String>();
		
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			String token = (st.nextToken()).replaceAll("[^a-zA-Z ]", "");
			words.add(token);
		}
		
		for(int i = 0; i < words.size(); i++)
		{
			if(i == 0)
				longestWord = words.get(0);
			else 
				longestWord = compareLengths(longestWord, words.get(i));
		}
		return longestWord;
	}
	
	private String compareLengths(String s1, String s2)
	{
		if(s1.length() > s2.length())
			return s1;
		else if(s1.length() == s2.length())
			return s1 + ", " + s2;
		else 
			return s2;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a string here:");
		Scanner s = new Scanner(System.in);
		Word word = new Word();
		System.out.println("Longest word(s): " + word.LongestWord(s.nextLine()));
	}
}
