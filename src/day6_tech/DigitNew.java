package day6_tech;

public class DigitNew {

	public static void main(String[] args) {
long Num =2L;
		
		String digit ="";
		
		if (Num >=0 && Num <=10000) {
			
			
			if (Num >= 0 && Num <=9 ) {
				digit = "One digit";
			}else if (Num >=10 && Num <=99) {
				digit = "Two digit";
			}else if (Num >=100 && Num<= 999) {
				digit ="Three digit";
			}else if (Num >= 1000 && Num <= 9999) {
				digit ="Foure digit";
			}else {
				digit ="Five Digit'";
			}
			
		}else {
			System.out.println("Invalid Number");
		}
		
		System.out.println("Your Number is"+ Num  +" it is "+ digit);
	
	}

	}

