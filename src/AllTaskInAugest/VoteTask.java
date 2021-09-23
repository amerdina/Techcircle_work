package AllTaskInAugest;

public class VoteTask {

	public static void main(String[] args) {
//		write a program that can check if the person is eligible to vote?
//				Note: you need two variables, age, and isUsCitizen
//	
		
	int age=6;
	boolean citizen=true;
	
	if (citizen==true && age>=18){
	System.out.println("you are eligible to vote");
	}
	if (citizen==false || !(age>=18)) {
		System.out.println("you are not eligible to vote");
	}
	
	
	}

}
