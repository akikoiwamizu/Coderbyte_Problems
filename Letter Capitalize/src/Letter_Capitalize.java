/*Project 6: For this challenge you will be capitalizing certain characters in a string.
 * Author: Akiko Iwamizu
 * Language: JAVA
 * Details:
	1. Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed 
		and capitalize the first letter of each word. 
	2. Words will be separated by only one space. 
*/

import java.util.Scanner; 

class Function 
{  
  String LetterCapitalize(String str) 
  { 
    String[] new_str = str.split(" ");   
    StringBuffer sb = new StringBuffer();
    
    for(int i = 0; i < new_str.length; i++)
    {
    	// Add the upper case first letter of the word
    	sb.append(Character.toUpperCase(new_str[i].charAt(0)))
    		.append(new_str[i].substring(1)) // Add the remaining substring of letters in the word
    		.append(" "); // Add the whitespaces in the string
    }
    
    str = sb.toString();
    return str;
  } 
  
  public static void main (String[] args) 
  {     
	System.out.println("Enter a string here: ");  
    Scanner  s = new Scanner(System.in);
    Function f = new Function();
    System.out.print(f.LetterCapitalize(s.nextLine())); 
  }   
  
}