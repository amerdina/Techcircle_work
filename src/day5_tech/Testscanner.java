package day5_tech;

import java.util.Scanner;

public class Testscanner {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);//creat instance of scanner object
//		System.out.println("please type the number");//should be do this first
//		int a=scan.nextInt();//to save scan in inta
//		System.out.println("value of a is"+a);//this to read the istruction
//	
//		int b=10;
//		int c=a+b;
//		System.out.println("result="+c);
//		scan.close();//close the instruction
//	}
//
//}
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