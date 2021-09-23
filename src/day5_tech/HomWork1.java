package day5_tech;

import java.util.Scanner;

public class HomWork1 {

	public static void main(String[] args) {
		System.out.println(" ENTER YOUR Time");
	
	Scanner scan=new Scanner(System.in);
    int  Time=scan.nextInt();
if (Time>24) {
		 if (Time>=1 && Time<=24) {
	
			 if(Time>=1&&Time<=12) {
			 System.out.println("Current time is" + Time + "AM");
			 }else if (Time>12 && Time<=24){
		 Time=Time-12;
			 System.out.println("Current time is" + Time + "PM");
		 }else {
				
			}
		 }else  
			 System.out.println("Invalid  Time"); 
	}else
			 
	scan.close();
		 
	}
	}
	
	