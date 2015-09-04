import java.util.*; 

class Function {  
  String FirstReverse(String str) { 
    String reverse = "";
    reverse += new StringBuilder(str).reverse().toString();
    return reverse;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
	System.out.println("Enter a string:");
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstReverse(s.nextLine())); 
  }   
  
}








  