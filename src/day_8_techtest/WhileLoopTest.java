package day_8_techtest;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
	//	task3
Scanner scan = new Scanner(System.in); 

		System.out.println("Please type Positive number");
		int Num1 = scan.nextInt();
		System.out.println("enter how many Times");
		
		int Num2 = scan.nextInt();
		
		System.out.println("we will  start" );
		System.out.println();
		
		int  Multi = 0;
		int count=1;
		while(count <= Num2) {
			System.out.println(Multi   = count * Num1);	 
//		//
			Multi = count * Num1;
			count++;
			System.out.println(Multi  = count    * Num1);
		}
//		//for (int count = 1; count <= Num2; count++) {
//			Multi = count * Num1;
//			System.out.println(Multi = count * Num1);	 
//			}
////		
////		
 scan.close();
 
	}}
 
//		/***tesk4
//		 * 	Scanner scan = new Scanner(System.in); 
//	System.out.println("Please type number");
//	int Num1 = scan.nextInt();	
//	for (int count = 1; count < 5; count++) {	
//		  Num1 = scan.nextInt();
//		//System.out.println(Num1);
//	}
//		 System.out.println(  );
//		 scan.close();
//}}
//		 * */
//		 