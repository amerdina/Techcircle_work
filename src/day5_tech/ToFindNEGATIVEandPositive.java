package day5_tech;

import java.util.Scanner;

public class ToFindNEGATIVEandPositive {

	public static void main(String[] args) {

		System.out.println(" ENTER YOUR Num");
	Scanner scan=new Scanner(System.in);
int Num=scan.nextInt();
		
		if (Num>=0){
			System.out.println(Num + " IS Possitive Number ");
		}else if (Num<= 0) {
			System.out.println(Num + " IS Negative Number ");
		}else 
			System.out.println( " invalid number");
		scan.close();
	}

	}



