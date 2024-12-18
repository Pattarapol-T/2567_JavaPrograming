import java.util.*;
public class LAb403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;
		System.out.println("Plese enter your name, seperated by a space ");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(" ");
		
		firstName = fullName.substring(0 - space);
		//System.out.println(firstName);
		System.out.println(abbreciaName(fullName)+firstName);
		
		input.close();
	}
	public static String abbreciaName(String fname) {
		String initailLetter = "";
		for(int i=0; i < fname.length();i++) {
			if(fname.charAt(i) ==' ') {
				initailLetter = (initailLetter + fname.charAt(i+1)).toUpperCase();
				initailLetter = initailLetter+".";
			}
			
		}
		return initailLetter;
		
	}

}
