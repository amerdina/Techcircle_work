package day_13SUBSTSRING;

public class SolveTask {

	public static void main(String[] args) {
		//3, Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
//		hint: you need an infinite loop
//
//		Scanner scan = new Scanner(System.in);
//		int sum = 0;
//		int num = 0;
//		do {
//			System.out.println("Please type a number");
//			num = scan.nextInt();
//			
//			if (num > 0) {
//				sum += num; // sum = sum + num
//			}
//		
//		} while (num > -1);
//
//		System.out.println(sum);
//
//		scan.close(); 
//	}
//}
//
//5,// Find the middle character of a string 
//Write a Java program to find the middle character of a string.
//If the length of the string is odd there will be one middle character. 
//If the length of the string is even there will be 2 middle characters.
//Input: abcde 
//output:c 
//intput car11car 
//output 11

//                012345
//String input = "12345678987654321";
//
//String middleChar = "";
//
//
//if (input.length()%2 == 1) {
//	System.out.println("1 middle character");
//	
//	int index= input.length() / 2;
//	
//	System.out.println(input.charAt(index));
//	
//	
//}else {
//	System.out.println("2 middle character");
//	
//	System.out.println(input.length() / 2 -1);
//	System.out.println(input.length() / 2);
//	
//	System.out.println(input.charAt(input.length() / 2 -1));
//	System.out.println(input.charAt(input.length() / 2 ));
//	
}}}
///////
String str = "computer12345";

if (str.length() == 5) {
	System.out.println(str);
}


if (str.length() < 5) {
	
	String str2 = str+"123456789";
	
	System.out.println(str2.substring(0, 5));
	
	
}

if (str.length() > 5) {
	System.out.println(str.substring(str.length()-5));
}

///////
/////this code to change char to string'///

/////String alphanumeric = "a1b2c34d098098efg";
//
//String referanceData = "abcdefghijklmnopqrstuvwxyz";
//
//for(int i = 0; i <alphanumeric.length(); i++ ) {
////	System.out.println(i);
//	
////	char currentChar = alphanumeric.charAt(i);
//	String currentChar = Character.toString(alphanumeric.charAt(i));
//			
//	if (referanceData.contains(currentChar)) {
//		System.out.println(currentChar);
//	}	
//	
//}
//this is defferent solve for same question
//String alphanumeric = "a1b2c34d098098efg";
//
//char a = 'a';
//
//int numA = a;
//
//char z = 'z';
//
//int numZ = z;
//
//System.out.println(numA);
//System.out.println(numZ);
//
//
//
//for(int i = 0 ; i < alphanumeric.length(); i++ ) {
//	
//	
//	char currentChar = alphanumeric.charAt(i);
//	
////	System.out.println(currentChar);
//	
//	
//	int num = currentChar;
//	
////	System.out.println(num);
//	
//	
//	if (num >= numA && num <= numZ) {
//		System.out.print(currentChar);
//	}
//	}
	//////3 way to solve task 
//for(int i = 0 ; i < alphanumeric.length(); i++ ) {
//	
//	
//	char currentChar = alphanumeric.charAt(i);
//	
////	System.out.println(currentChar);
//	
////	int num = currentChar;
//	
////	System.out.println(num);
//	
//	
//	if (currentChar >= 97 && currentChar <= 122) {
//		System.out.print(currentChar);
//	}
//}
white_check_mark
eyes
raised_hands
React
Reply


	


