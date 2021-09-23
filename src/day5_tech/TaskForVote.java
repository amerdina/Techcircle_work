package day5_tech;

import java.util.Scanner;

public class TaskForVote {

	public static void main(String[] args) {
	//write a program that can check if the person is eligible to vote?
		//Note: you need two variables, age, and isUsCitizen
		System.out.println(" ENTER YOUR age");
		
		Scanner scan=new Scanner(System.in);
	     int Age=scan.nextInt();
	//boolean citizen ;		
			if (Age>=18) {
				  //if (citizen==true) {
					System.out.println("You Are Eligibal To Vote");
				
			}else {
				 System.out.println("You Are NOT Eligibal");
			}
	
			scan.close();
	
	}
	

}
