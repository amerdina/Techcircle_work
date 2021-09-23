package day5_tech;//

import java.util.Scanner;

//Write a Java Program using if statement.
//*  Note: Create a variable time as a integer and print below messages: 
//	     time is between 1 to 24;
//*      Good Morning  
//	5< 12 
//	Good Afternoon
//	12 — 17
//	Good Evening
//	17—24
//
public class Taskthreeif {

	public static void main(String[] args) {
		
		
				System.out.println("Enter your Time=");
				Scanner elira=new scanner(System.in);
				int Time=elira.nextInt();
				System.out.println("your Time is ="+ Time);
				
						
if(Time>=5 && Time<=12){
	System.out.println("Good morning");
}
else if (Time>=12 && Time<=17) {
		System.out.println("Good Afternoon");
	}
else if (Time>=17 && Time<=24) {
		System.out.println("Good Evening");
		
	}
System.out.println("your Time is =" +Time);
 elira.close();
		
	}


}
