package day6_tech;

public class TaskDigit {

	public static void main(String[] args) {
		long Num=12L;
		String digit="";
		
		if (Num>=0 && Num<=9){ 
		     digit="one digit";
		     
		}else if(Num>=10 && Num<=99){
		digit="Two digit";
		
		}else if (Num>=100 && Num<=999){
		digit="Three digit";
		
		}else if(Num>=1000 && Num<=9999){
		digit="foure digit";
		
		}else {digit="Five digit";
		
		}
	}else {
		System.out.println("Invalid you should use one to four digit");
		}
		System.out.println("your Numberis"+Num+"is"+digit);
		{
			{
		
		
		
		
			
