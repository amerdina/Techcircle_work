package day_13SUBSTSRING;

public class ChangeCharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaaaaabbbbbbbbbbbccccccccccccddddddeeeeffffgggg";
		//String expectedStr = "abc";
		
		String uniqueChars = "";
		
		for (int i = 0 ; i < str.length(); i++) {
			
			String currentChar = Character.toString(str.charAt(i));
			
			if (!uniqueChars.contains(currentChar)) {
				
				uniqueChars += currentChar;
				
			}
			
			
		}
		

		System.out.println(uniqueChars);
		
		
	}
	}

	}

}
