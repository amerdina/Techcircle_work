package day5_tech;//
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
		int T1=17;
		
				
if(T1>=5 && T1<=12){
	System.out.println("Good morning");
}
	if (T1>=12 && T1<=17) {
		System.out.println("Good Afternoon");
	}
	 if (T1>=17 && T1<=24) {
		System.out.println("Good Evening");
	}
	}	



}
