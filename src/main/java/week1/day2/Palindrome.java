package week1.day2;

public class Palindrome {
		//Build a logic to find the given string is palindrome or not
	     public static void main(String[] args) {
	   
			
		
		//
		 // Pseudo Code
		
		 // a) Declare A String value as"madam"
		 String i = "madam";
		 
		 // b) Declare another String rev value as ""
				 String rev = "";
		 // c) Iterate over the String in reverse order
				 for (int a=i.length()-1; a>=0; a--) {
					// d) Add the char into rev
					 rev = rev+i.charAt(a);
			
			 }
		 
		 //e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 if (i.equals(rev))
			 System.out.println("The given string is palindrome");
		 else
			 System.out.println("The given string is not palindrome");
		 //Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 //

	     }

}
