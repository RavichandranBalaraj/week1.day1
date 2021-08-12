package week1.day2;

public class ReverseEvenWords {
	
public static String rev(String str)
{
	String rev="";
	for (int i = str.length()-1; i >=0; i--) {
		rev+=str.charAt(i);
		
	}
	return rev;
}
	public static void main(String[] args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		

		// Pseudo Code:
		 
		 // Declare the input as Follow
	      		String test = "I am a software tester"; 
		
	//a) split the words and have it in an array
	      		String[] sarr=test.split(" ");
		//b) Traverse through each word (using loop)
	      		for(int i=0;i<sarr.length;i++)
		//c) find the odd index within the loop (use mod operator)
		{ 			
		
		//d)split the words and have it in an array
		
		//e)print the even position words in reverse order using another loop (nested loop)
		if(i%2!=0) {
		//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		sarr[i]=rev(sarr[i]);
		}
	//

	}
for (int i = 0; i < sarr.length; i++) {
	System.out.print(sarr[i]+" ");
}
//System.out.println(test1);
}
}
