package day6_tech;

public class DigitWork {

	public static void main(String[] args) {
	int Num = 34342;
	String digit =" ";
		
		if (Num >=0 && Num <=10000) {
			
			
			if (Num >= 0 && Num <= 9) {
				digit =  "one digit";}
				
			 if (Num >= 10 && Num <= 99) {
				digit =  "two digit";}
				
			 if (Num >= 100 && Num <= 999) {
				digit =  "Three digit";}
				
			 if (Num >= 1000&& Num <= 9999) {
				digit =  "Four digit";}
				
			 if (Num >= 10000 && Num <=99999) {
				digit =  "Five digit";}
			
			
	//	else {
	//		System.out.println("Invalid score");
		}//
		
		System.out.println("Your score is <"+ Num + "> grade is <"+ digit +">");

	}}

			


