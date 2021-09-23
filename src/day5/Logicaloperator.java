package day5;

public class Logicaloperator {

	public static void main(String[] args) {
//		logical and &&
	 int num1=10;
	 int num2=10;
	 int num3=15;
	 
	 boolean result1=(num1==num2);
	 boolean result2=(num2<=num3);
	 System.out.println(result1&&result2);
	 
	 boolean result3=(result1&&result2);//it alwaays result3 hold this value
	 System.out.println(result3);
		
//		System.out.println(num1>=num2 && num1);
//		System.out.println(num1>=num2 && num1);	
		
		System.out.println(num1>=num3 && num2<=num3);
		System.out.println(num1>=num2 && num2>=num3);
		
	}

}
