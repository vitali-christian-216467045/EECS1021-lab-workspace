import java.util.Scanner;

public class ForLoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter 5 integers
		// then calculate their average
		
		int total = 0;

		for(int i = 1; i <= 5; i++) {
			System.out.println("Enter an integer " + i + ":");
			int x = input.nextInt();
			total += i;
		}
		
		double average = ((double) total) / 5;
		System.out.println("Average is " + average);
		input.close();

	}

}
