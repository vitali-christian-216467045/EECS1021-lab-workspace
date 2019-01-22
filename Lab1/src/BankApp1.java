import java.util.Scanner;
public class BankApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Problem:
				// 1. Prompt the user for an initial balance of their bank account.
				// (balance > 0)
				// 2. Prompt the user for a transaction
				// 3. Prompt the user for an amount
				// 4. Perform the transaction accordingly and output the resulting balance to the console
				// Note: As soon as an error occurs, your app should print out an error right away
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a balance (e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();
		
		if(0 < balance && balance <= 1000) {
			// valid initial balance
		}
		else {
			System.out.println("Error: inital balance " + balance + " is not in (0, 1000)."); 
		}
		
		System.out.println("Enter a transaction type: \"d\" or \"w\"):");
		String type = input.nextLine();
		
		if(type.equals("d")) {
		}
		else if(type.contentEquals("w")) {
		}
		else {
			System.out.println("Error: transaction type " + type + " is neither d nor w.");
		}
		
		System.out.println("Enter an amount for " + type + ": ");
		double amount = input.nextDouble();
		input.nextLine();
		
		
		if(type.equals("d")) {
			if(amount <= 0) {
				System.out.println("Error: deposit amount is not positive.");
			}
			else if(balance + amount > 1000) {
				System.out.println("Error: deposit amount is too large.");
			}
			else {
				balance = balance + amount;
				balance += amount;
			}
		}
		else if(type.equals("w")) {
			if(amount <= 0) {
				System.out.println("Error: withdraw amount is not positive.");
			}
			else if(amount >= balance) {
				System.out.println("Error: withdraw amount is too large.");
			}
			else {
				balance = balance - amount;
				balance -= amount;
			}
		}
		
		System.out.println("Resulting balance after performing transaction of " +  type + "with $" + amount + "; " + balance);
		
		
		input.close();
	}

}
