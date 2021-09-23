package day4withpractice_helloworld;

public class TaskDmv {

	public static void main(String[] args) {
		// String ID="A12134523";
		 String ID="A12134523";
		 char ch=Character.toUpperCase(ID.charAt(0));
		 ID=ch+ID.substring(1);
		 char Class='A';
		 char Sex='F';
		 String DOB = "10/17/1980";
		 String Eyes="BLK";
		 String Endorsment="Non";
		 String IssREI="11/24/2020";
		 float HeightToFt=5.4f; 
		 String Restraction="NONE";
		 String EXP="10/17/1980";
		  String FirstName="AMER";
		  String MiddleName="AHMED";
		  String LastName="ALI";
		  String Address="8234 LINBLAKE CT.";
		  String City="MANASSAS";
		  String State ="VA";
		  Short ZipCode=20111;
		  System.out.println("Customer Identifier"+"\n"+ID+"\n");
		  System.out.println("Name"+"\n"+LastName+"\n"+FirstName+","+MiddleName+"\n");
		  System.out.println("Address"+"\n"+Address+"\n"+City+","+State+","+ZipCode+"\n");
		  System.out.println("Sex"+"\t"+"\t"+"Class"+"\t"+"\t"+"Date of Birth");
		  System.out.println(Sex+"\t"+"\t"+Class+"\t"+"\t"+DOB);
		  System.out.println("Eyes"+"\t"+"\t"+"Enorsments"+"\t"+"Iss REI");
		  System.out.println(Eyes+"\t"+"\t"+Endorsment+"\t"+"\t"+IssREI);
		  System.out.println("Height"+"\t"+"\t"+"Restraction"+"\t"+"Exp");
		  System.out.println(HeightToFt+"\t"+"\t"+Restraction+"\t"+"\t"+EXP);
		  
		  
		  
		  
		  
		  
		 
		 
		 
		 
		 

	}

}
