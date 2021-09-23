package day_10LoopFor;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) throws InterruptedException {
		 
//String str="Techcircle";
//System.out.println(str);
//System.out.println(str.charAt(0));
//System.out.println(str.charAt(6));
//		for(int i=1;i<4;i++) {
//			for(int j=1;j<4;j++) {
//				System.out.print(" "+j+" ");
//			}
//			System.out.println();
//		}
		
		
		System.out.println("Timer ");
		Scanner scan= new Scanner(System.in);
		
        System.out.println("Enter your timer with minuts ");

		for(int i=scan.nextInt();i>0;i--){
			System.out.println(i-1);
			System.out.println("++++++++++++++++");
			for(int j=59; j>=0;j--) {
				System.out.println("Secound " + j);
				Thread.sleep(1000);
			}
		}
		
		
		
		scan.close();
	}}

