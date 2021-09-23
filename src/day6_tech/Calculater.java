package day6_tech;

public class Calculater {

	public static void main(String[] args) {
String operator="^";
int num1=8;
int num2=2;
int total=0;
if(operator=="+") 
{total=num1+num2;
	//System.out.println(total);
}else if (operator=="-") {
	total=num1-num2;
	//System.out.println(total);
}else if  (operator=="/") {
	total=num1/num2;
	//System.out.println(total);
}else {System.out.println("invalid");}
System.out.println(total);
	}

}
