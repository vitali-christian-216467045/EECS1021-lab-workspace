import java.util.Scanner;

public class LogicalOperationApp2a {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter an integar between 1 and 10:");
		int i = input.nextInt();
		
		boolean isBetween1and10 = 1 <= i && i <= 10;
		
		System.out.println("The number you entered " + i + " is between 1 and 10; " + isBetween1and10);
		
		
		input.close();
	}

}
