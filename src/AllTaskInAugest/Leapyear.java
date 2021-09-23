package AllTaskInAugest;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		//int year=2013;
//		if (year>=1000)
//		if(year%4==0) {
//			System.out.println("the leap year"+ true);
//		}else 
//			{System.out.println("the leap year"+false);
//		}
//		else System.out.println("invalid");
/*write a program that can print out the max 
 number between two numbers using scanner
 *  * */

//Scanner scan = new Scanner(System.in); 
//		
//		System.out.println("Please type first number");
//		 double Num1 = scan.nextDouble();
//		 
//	System.out.println(" Type the secound number");
//	double Num2 = scan.nextDouble();
//	
//if(Num1>Num2) {
//		System.out.println(Num1 + "is the max number");
//}else if (Num2>Num1) {
//	System.out.println(Num2 + "is the max number");
//}else {
//	System.out.println("Both numbers are equal");
//}
//		scan.close();
//	}
//}

/*write a program that can check if the person is eligible to vote?
Note: you need two variables, age, and isUsCitize
 * */
//Scanner scan = new Scanner(System.in); 
//
//System.out.println(" Are you Citizen type True or False??");
// boolean Citizen = scan.nextBoolean();
// 
// if(Citizen) {
//	 System.out.println("How old are you??");
// int age= scan.nextInt();
//     if (age>=18) {
//	 System.out.println(" you are eligible to vote");
// }else {System.out.println(" you are not eligible to vote");
// }
// 
// }else { if(Citizen) {
//	 System.out.println(" you are not eligible to vote");
// }
// else {
 //System.out.println(" you are not eligible to vote");
// }
// 
//scan.close();
// }}
//
//	}

		
//		Scanner scan = new Scanner(System.in); 
//		System.out.println("Please type the number");
//	 int Num1 = scan.nextInt();
//	 
//	 if(Num1>0) {
//		 System.out.println("number" + "is positive number");
//	 }
//			 if(Num1<0) {
//				 System.out.println("number" + "is Negative number");
//			 } 
//			 if (Num1==0){
//						 System.out.println("number" + "is o");
//			 }
//	scan.close();	
//		
//						 }
//						 }
//		/****
		
		//String SupperMarket="  milk";
		//if (SupperMarket=="full fat milke") { 
			//System.out.println("buy full fat milk");	
//		}else if(SupperMarket=="2%fat milk") {
//			System.out.println("buy 2% fat milk");
//			}else if(SupperMarket=="skimmed milk") {
//				System.out.println("buy skimmed milk");
//			}else 
//				System.out.println("invalid type");
//****/

		
		
		
	
//			int input=2;
//			String SuperMarketHas="";
//			switch(input) {
//			case 1:
//				System.out.println("buy full fat milk");
//				break;
//			case 2:
//				System.out.println("buy 2% fat milk");
//				break;
//			case 3:
//				System.out.println("buy skimmed milk");
//				break;
//				default:
//				System.out.println("invalid type");
//			}}}
				
			String SupperMarket="Full fat milk"	;
			boolean Sale=true;
			int ExDat=14;
			
			if(SupperMarket=="Full fat milk") {
					if((Sale)&&(ExDat>14))
					{
						System.out.println("BUY 2 GALLON FULLFAT MILK");
					
					}else {
				
						System.out.println("BUY 1 GALLON FULLFAT MILK");
								
					}else if (SupperMarket=="2 persent milk") {
				
					System.out.println("BUY 2persent MILK");
					
				}else {
					System.out.println("BUY Skimmed Milk ");
				}
			}}}
}