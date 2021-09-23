package AllTaskInAugest;

import java.util.Random;
import java.util.Scanner;

public class DigitReverse {

	public static void main(String[] args) {
		
	/** Make it total of 5 characters
Write a program that checks the length of the string. 
If the string length is less than 5 characters then add any 
character and make it total of five character.
if the length is equal to 5 then keep the original string. 
if string length greater than 5 characters then keep the last 5 characters.
Examples:
String str1 = "computer"; String str2 = "Java"; String str3 = "Pizza";
//expected "puter" , "JavaA" "Pizza"
	 * **/
	 
	//Task..6
//	 System.out.println(" Enter any string more than 5 characters");
//	 Scanner scan=new Scanner(System.in);
//	 String str=scan.nextLine();
//	 
//	if (str .length() == 5) {
//		System.out.println (str);}
//	
//	else if (str .length() > 5) {
//	      	for(int i=str.length()-5 ;i< str.length();i++) {
//		System.out.print (str.charAt(i)) ;}}
//	      	
//	else if (str .length() < 5) {
//
//			System.out.println (str +"A");}
//		 
// 
//		 scan.close();
//
//	}}
//
 ///////////////

//task.7
// Extract letters from a String
//Write a program to extract all the letter from a given alphanumeric string "a1b2c34d098098efg"
//output:
//abbdefg
////Task 7
//      System.out.println(" ENter any string and digit");
//        Scanner scan=new Scanner(System.in);
//       String str=scan.nextLine();
//    
//        String str2="";
//         
//         str2=str.replaceAll("[0-9]", str2);
//        System.out.println(str2);
//
// 
//        scan.close();
//
//	}}
//6//String str="java";
//char Ch= Character.toUpperCase(str.charAt(0)); 
//		Scanner scan=new Scanner(System.in);
//	
//		System.out.println("enter a word");
//	
//		String str=scan.next();
//		if(str.length()==5) {
//			System.out.println(str);
//			
//		}
//			else if (str.length()<5) {
//			System.out.println(str + "A");
//		}
//		else if (str.length()>5) {
//				for(int i =str.length()-5;i<str.length() ;i++) {
//				
//					System.out.print(str.charAt(i));
//					
//			}
//			} 
//		scan.close();
//}}
//
//5, Find the middle character of a string
//Write a Java program to find the middle character of a string. 
// If the length of the string is odd there will be one middle character.
//If the length of the string is even there will be 2 middle characters.
//Input: abcde
//output:c
//intput car11car
//System.out.println("enter your code");
//Scanner scan =new Scanner(System.in);
//String str=scan.next();
//int Le=str.length();
//if(Le % 2==1) {
//	System.out.println(str.charAt(Le/2));}
//	else {
//		System.out.print(str.charAt(Le/2 -1 );
//		System.out.println(str.charAt(Le/2));
//	}
//scan.close();
	}}
/**
 *  1---write a program that can calculate the sum of 5 user entered inputs
 *2--- Write a program that can return the factorial number of any given number
Ex:	input: 5
output: 120  ( because: 5! = 5 * 4 * 3 
 * */
//Task//1
//		System.out.println("Enter five numbers");
//			Scanner scan= new Scanner(System.in);
//			int sum=0;
//			for(int i=5;i>= 1;i-- ) {
//				int num=scan.nextInt(); 
//				sum=sum+num;}
//				System.out.println(sum);
//				scan.close();
//	}}
		//////////////////////
	 	//Task--2
//		System.out.println("Enter  number ");
//		Scanner scan= new Scanner(System.in);
//		 int num=scan.nextInt();
//		for(int i=num-1;i>=1;i--) {
//			 
//	  	 num=( num *i) ; }
//		
//		System.out.println( num );
//			
//	  scan.close();
//		}}
//		 
///*TASK 3, Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
//hint: you need an infinite loop
//Task 4,
// Write a program that asks the user to input an integer and then outputs the number with the digits reversed. 
//For example, 
//if the input is 34567, the output should be 76543.
//
////Task4/ 
//		System.out.println("ENTER INTEGER NUMBER  ");
//		Scanner scan=new Scanner(System.in);
//		String dim=scan.nextLine();
//			  for (int j=dim.length()-1;j>=0;j--) {
//			 System.out.print (dim.charAt(j));}
//		 scan.close ()  ;
//	}}
