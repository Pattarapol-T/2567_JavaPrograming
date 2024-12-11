import java.util.*;
public class Lab303  {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = input.nextLine();
		int countspace = 0;
		while (true) {
			
			if (sentence.endsWith(".")) {
				break;
	}