import java.util.Scanner;

public class DebuggerIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int x = input.nextInt();
		
		if(x < 0) {
			System.out.println("x is negative");
		}
		else {
			if(5 <= x && x <= 10) {
				System.out.println("x is between 5 and 10");
			}
			else if(15 <= x && x <= 20) {
			}
			else {
				System.out.println("x is not in [5, 10] and not in [15, 20]");
			}
		}
		
		
		input.close();

	}

}
