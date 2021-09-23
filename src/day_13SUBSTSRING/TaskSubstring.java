package day_13SUBSTSRING;

public class TaskSubstring {

	public static void main(String[] args) {
		            //  012345678901
		String email="irfan.tursun@techcirclesolutions.org";
		 String email2="test@gmail.com";
		 
		 //extrect username and domain name from e.mail
		 
		// String username="irfan.tursun";
		// String domainName="@techcirclesolutions.org";
		 
		 
		 String username=email.substring(0,email.indexOf("@"));
		 System.out.println(username);
		 System.out.println(email.lastIndexOf("."));
		 
		 int startIndex=email.indexOf("@")+1;
		 int endingIndex=email.lastIndexOf(".");
		 
		 
		  
		 
		 
	}

}
