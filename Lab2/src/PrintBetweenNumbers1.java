import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a lower bound:");
		int x = input.nextInt();
		
		System.out.println("Enter a upper bound:");
		int y = input.nextInt();
		
		int total = 0;
		
		if(x < y) {
			System.out.println("Numbers between " + x + " and " + y + " :");
			for(x = x - 1 ; x < y ; x++) {
				total = x + 1;
				System.out.println((total));
			}
		}
		else {System.out.println("Error: lower bound " + x + " is not less than or equal to the upper bound " + y);
		System.out.println("Bye!");}
		
		input.close();

	}

}
