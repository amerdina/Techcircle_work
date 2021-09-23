package day_10LoopFor;

import java.util.Random;
import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) throws InterruptedException {
		   
		
//		for(int i=1;i<15;i++) {
//			for(int j=1;j<61;j++) {
//	System.out.print (j+" ");
//			}
//			System.out.println();
//		}
		 
	System.out.println("time");
	Scanner scan= new Scanner(System.in);
	System.out.println("ENTER YOUR TIME");
	for (int i=scan.nextInt() ; i>0 ;i--) {
	System.out.println(i-1);
	System.out.println("+++++++++++++++++++");
	for(int j=59;j>=0;j--) {
		System.out.println("second" +j);
		Thread.sleep(1000);
	}
	}
	
	System.out.println("Times up");
	scan.close();
	
	
	
}}
