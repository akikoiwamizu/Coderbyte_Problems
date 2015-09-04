//Project 1: For this challenge you will be reversing a string.
//Author: Akiko Iwamizu
//Language: JAVA
import java.util.Scanner; 

class Function 
{  
  private String FirstReverse(String str) 
  { 
    String reverse = "";
    reverse += new StringBuilder(str).reverse().toString();
    return reverse;
    
  } 
  
  public static void main (String[] args) 
  {   
	System.out.println("Enter a string here:");
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstReverse(s.nextLine())); 
  }   
  
}








  