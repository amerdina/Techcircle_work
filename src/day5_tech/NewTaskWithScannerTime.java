package day5_tech;

import java.util.Scanner;

public class NewTaskWithScannerTime {

	public static void main(String[] args) {
		//this more practice about scanner time///////
		
//		System.out.println("Enter your Time=");
//		Scanner scan =new Scanner(System.in);
//		int Time=scan.nextInt();
//		System.out.println("your Time is =" +Time+"\t");
//if(Time>=5 && Time<=12){
//System.out.println("Good morning");
//}
//else if (Time>=12 && Time<=17) {
//System.out.println("Good Afternoon");
//}
//else if (Time>=17 && Time<=24) {
//System.out.println("Good Evening");
//
//}
//
//scan.close();
//
//}
//	}
//

		
//		System.out.println("Please type a time ?");
//		Scanner elira = new Scanner(System.in);
//		int Time = elira.nextInt();
//		
//		if (Time >= 5 && Time < 12) {
//			System.out.println("Good Morning!");
//		}
//		
//		if (Time >= 12 && Time < 17) {
//			System.out.println("Good afternoon!");
//		
//
//		}
//		
//		if (Time >= 17 && Time < 24) {
//			System.out.println("Good evening!");
//
//		}
//		
//		elira.close();
//
//	}
//}
Scanner time =new Scanner(System.in);
		
		System.out.println("what time is this?");
		
		int time1 = time.nextInt();
		
		
		
		if (time1<12 && time1 >5) { 
			
			System.out.println("Good Morning!");
		}
		if (time1>12 && time1 <17) {
			System.out.println("Good Afternoon");
		}
		if (time1 <24 && time1 >17) {
			System.out.println("Good Evening");
		}}}