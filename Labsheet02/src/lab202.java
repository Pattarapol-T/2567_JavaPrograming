import java.util.*;
public class lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int number = input.nextInt();
		while(true) {
			System.out.print("Input number : ");
			int currentnumber = input.nextInt();
			if(currentnumber<number) {
				System.out.println("BYE BYE");
				break;
			}
			number = currentnumber;
		}

	}

}
