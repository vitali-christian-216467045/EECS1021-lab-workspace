import java.util.Scanner;

public class LogicalOpperationApp1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.println("Enter an integer");
		int i = input.nextInt();
		boolean isLessThanOrEqualToZero = i > 0;
		System.out.println("The number you entered was positive: " + !isLessThanOrEqualToZero);

		input.close();
	}

}
