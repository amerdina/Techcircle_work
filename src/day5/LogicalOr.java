package day5;

public class LogicalOr {

	public static void main(String[] args) {
	//	Logical or ||
byte a=3;
byte b=3;
	byte c=6;
boolean condition1 = a+b ==c;//t
boolean condition2= c<a*b;//f
System.out.println(condition1 || condition2);//t
boolean condition3=(a*b-c==a) ;//t
boolean condition4=c<a;//f
System.out.println(condition3 ||condition4);//t

//System.out.println(b>c || a*b>c);//t
//System.out.println(b>c || a*b<c);

//logical NOT  !
boolean valueA=true;
System.out.println(valueA);
System.out.println(!valueA);


 System.out.println(b>c);
 System.out.println(!(b>c));
	}

}
