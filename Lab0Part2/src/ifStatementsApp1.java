import java.util.Scanner;

public class ifStatementsApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int i = input.nextInt();
		int abs = i;
		if(i < 0) {
			abs = -i;
			abs =abs * -1;
			
			
		}
		System.out.println("The absolute value for " + i + " is: " + abs);
		
		input.close();

	}

}
