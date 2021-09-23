package day6_tech;

public class DigitSwich {

	public static void main(String[] args) {
		
		int x=15;
		
		switch(x) {
		case 1:
			System.out.println("this number one digit");
			break;
		case 10:
			System.out.println("this number two digit");
			break;
		case 100:
			System.out.println("this number two digit");
			break;
			default:
			System.out.println("invalid");
		}
	}
}
