package day7whileloop;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
		System.out.println("Enter your password");
 String Password="Amer1935";
 
 Scanner scan = new Scanner(System.in); 
 String Guess=scan.nextLine();
 
 while(!Guess.equals( Password))
 //while(Guess!==Password)
 {
	 System.out.println("Enter your password againdd");
	 Guess=scan.nextLine();
 }
 System.out.println("yuo find it");
 	scan.close();
		
	}}







