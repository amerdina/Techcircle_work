package Day_14_Practice;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* Write an efficient program in Java to remove all occurrences of a
		// * given character in Java. For example, if the given String is "Programming"
		// * and the given character to remove is "m" then your function should return "Prograing".
		//"Programming"
		//"Prograing"
		
//	FRST SOLVING///	String str = "Programming";
//		String targetChar = "m";
//		System.out.println(str.replace(targetChar, ""));
//		String Str1="programming";
//		String charti="";
//		///////
	// 222 SOLVING
		//Write a program to reverse a string
//		input = ABCD
//		output = DCBA
		
		
//		System.out.println("enter number");
//Scanner scan = new Scanner(System.in);
//		
//		String input = scan.next();
//	for (int i=input.length()-1 ;i>=0 ;i--) {
//	 
//System.out.print (input.charAt(i));
//
//	}
//
//scan.close();
//		}
//	}	
//	\\\\\\\\\\\\\	
/*Write an efficient Java program to return the maximum occurring character
 *  in the input string, e.g., if the input string is "Java" then the function should return 'a'.*/
		
 		 
 		 
 		String str = "abbbbbbbdeeffg";
		//String expectedStr = "b";
		
		String uniqueChars = "";
		int count=0;
		int maxoccuringChar='';
		
		for (int i = 0 ; i < str.length()-1; i++) {
			for (int j = i ; i < str.length(); i++) {
			if (str.charAt(i)==maxoccuringChar()) {
      String wordChar = Character.toString(str.charAt(i));
			
			
if (! uniqueChars.contains(wordChar)) {
				
		uniqueChars += wordChar;
				
			}
			
			
		}
		
		System.out.println(uniqueChars);
		}}
		
//	}
//}
// 	for (int i=0 ;i<=word.length();i++) {
// 		System.out.println(word.charAt(i));
// 		if(word.charAt(i)==)
// 	}
//		
// 		scan.close();
//  		}
//  	}	
//	
