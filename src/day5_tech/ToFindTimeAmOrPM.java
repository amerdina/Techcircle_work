package day5_tech;
//Write a program to find current time is am or pm ?
//if current time is > 12 then its PM
//
//if current time is < 12 then its AM
//input :
//5
//output:
//current time is 5 AM
//input = 16;
//current time is 4 PM;
import java.util.Scanner;

public class ToFindTimeAmOrPM {

	public static void main(String[] args) {
		System.out.println(" ENTER YOUR SCORE");
		char grade = ' ';
	Scanner scan=new Scanner(System.in);
int score=scan.nextInt();
		
		
		// 0 <= score <= 100 
		
		if (score >=0 && score <=100) {
			
			
			if (score >= 90 && score <= 100) {
				grade = 'A';
			}else if (score >= 80 && score < 90) {
				grade = 'B';
			}else if (score >= 70 && score < 80) {
				grade = 'C';
			}else if (score >= 60 && score < 70) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
		}else {
			System.out.println("Invalid score");
		}
		
		System.out.println("Your score is <"+ score + "> grade is <"+ grade +">");
		
		
scan.close();
	}

}

	}

}
