import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a lower bound:");
		int x = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a upper bound:");
		int z = input.nextInt();
		input.nextLine();
		
		if(x > z) {
			System.out.println("Error: lower bound " + x + " is not less than or equal to the upper bound " + z);
		}
		else if(x == z) {
			System.out.println("Numbers between " + x + " and " + z + ":");
			System.out.println(x);
			System.out.println("Bye!");
		}
		else {
			System.out.println("Numbers between " + x + " and " + z + ":");
			for (int i = x; i <= z ; i++) {
				System.out.println(i);
			}
			System.out.println("Bye!");
		}
		int i = 0;
		
		while (i < 1) {
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			String ans = input.nextLine();
			
			ans = ans.toUpperCase();
			
			if(ans.equals("Y")) {
				System.out.println("Enter a lower bound:");
				x = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter a upper bound:");
				z = input.nextInt();
				input.nextLine();
				
				if(x > z) {
					System.out.println("Error: lower bound " + x + " is not less than or equal to the upper bound " + z);
				}
				else if(x == z) {
					System.out.println("Numbers between " + x + " and " + z + ":");
					System.out.println(x);
					System.out.println("Bye!");
				}
				else {
					System.out.println("Numbers between " + x + " and " + z + ":");
					for(int j = x ; j <= z ; j++) {
						System.out.println(j);
					}
				}
			}
			else {
				System.out.println("Bye!");
				i += 1;
			}
		}
		
		
		input.close();
	}

}
