package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	 //* Pseudo Code
	  
	 //*Declare a String 
		String text1 = "stops";
	 //*Declare another String
		String text2 = "potss"; 
	 //* a) Check length of the strings are same then (Use A Condition)
		if (text1.length()==text2.length())
		{
			
		
	 //* b) Convert both Strings in to characters
			char arr[]=text1.toCharArray();
			char arr2[]=text2.toCharArray();
			//* c) Sort Both the arrays
			Arrays.sort(arr);
			Arrays.sort(arr2);
			 //* d) Check both the arrays has same value
			text1=text1.copyValueOf(arr);
			text2=text2.copyValueOf(arr2);
			if(text1.equals(text2))
				System.out.println("Anagram");
		}
	 
		
	
	  
	

	}
}
