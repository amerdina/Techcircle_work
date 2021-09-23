package day5;

public class TernaryOperator {

	public static void main(String[] args) {
		//variable x= (condition)? true vaue : false value; 
		//shorter in line statement
		int a,b;
		
	a=10;
	//condition  //false
	b=(a==1) ? 20:30;
	System.out.println(b);
	
	b=(a==10) ? 20:30;//true
		System.out.println(b);
		
		int c=(a==10 && b<40)?50:90;
		System.out.println(c);
		
	}

}
