import java.util.Scanner;

public class ifStatementsApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Three possible errors from the user:
		// 1. balance < 0 
		// 2. amount < 0
		// 3. amount <= balance
		System.out.println("Enter an integer balance");
		int initialbalance = input.nextInt();
		
		System.out.println("Enter an amount to withdraw:");
		int amount = input.nextInt();
		
		if(initialbalance < 0) {
			// body of if-statement
			System.out.println("Error: Inital balance should not be negative.");
		}
		else if(amount < 0) {
			System.out.println("Error: Amount to withdraw should not be negative.");
		}
		else if(amount >= initialbalance) {
			System.out.println("Error: Amount to withdraw should be smaller than balance.");
		}
		
		else {
			// body of else-statement
			int resultingBalance = initialbalance - amount;
			initialbalance = initialbalance - amount;
			System.out.println("Inital balance " + initialbalance + " after withdrawing " + amount);
			System.out.println(" has the resulting balance " + resultingBalance);
			
		}
		
		
		input.close();
	}

}
