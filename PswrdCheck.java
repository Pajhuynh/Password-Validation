import java.util.Scanner;

public class PswrdCheck {

	public static void main(String[] args) {
		final int NUM_UPPER_LETTERS = 1;
		final int NUM_LOWER_LETTERS = 1;
	     int upperCount=0;
	     int lowerCount=0;
	     
        System.out.println("Please create a password here" + ":");
		Scanner in = new Scanner (System.in) ;
		String pswrd = in.nextLine();
		int pswrdLngth= pswrd.length();
		for (int i=0; i < pswrdLngth; i++) {
			char ch = pswrd.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowerCount++;
			}if(Character.isUpperCase(ch)) {
				upperCount++;
			}
		}
			if(pswrd.length()>=7 && pswrd.length()<=12 && 
					upperCount >= NUM_UPPER_LETTERS && lowerCount >= NUM_LOWER_LETTERS 
					&& pswrd.contains("!"))
				System.out.println("Valid Password");
			else {
				System.out.println("Error");
				if(upperCount < NUM_UPPER_LETTERS)
					System.out.println("uppercase letters");
			if(lowerCount < NUM_LOWER_LETTERS)
				System.out.println("lowercase letters");
				
			}
					
		}
}
	
	/* ○ At least one lowercase letter
	○ At least one uppercase letter
	○ At least minimum 7 characters
	○ At least maximum 12 characters
	○ An exclamation point: !
	● If the user meets all the requirements, print the string "Password valid and
	accepted" to the console
	● If the password fails any of the requirements, print the string "Error ".
	*/
