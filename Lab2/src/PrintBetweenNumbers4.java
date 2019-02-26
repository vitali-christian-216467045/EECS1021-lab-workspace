import java.util.Scanner;

public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a lower bound:");
		int x = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter a upper bound:");
		int z = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter middle number:");
		int m = input.nextInt();
		input.nextLine();
		
		if(x > z) {
			System.out.println("Error: lower bound " + x + " is not less than or equal to the upper bound " + z);
		}
		else if(x == z && x == m) {
			if((m % 2) == 0) {
				System.out.println("Odd numbers between " + x + " and " + m + ":");
				System.out.println(x);
			}
			else {
				System.out.println("Odd numbers between " + x + " and " + m + ":");
				System.out.println(x);
				System.out.println("Even numbers between " + m + " and " + z + ":");
			}
		}
		else if(x < z && (m < x || m > z)) {
			System.out.println("Error: middle number " + m + " is not in-between te lower bound " + x + " and upper bound " + z);
		}
		else {
			if((x % 2) == 1) {
				System.out.println("Odd numbers between " + x + " and " + m + ":");
				for (int i = x; i <= m; i+=2) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("Odd numbers between " + x + " and " + m + ":");
				for (int i = (x + 1); i <= m; i+=2) {
					System.out.println(i);
				}
			}
			if((m % 2) == 0) {
				System.out.println("Even numbers between " + m + " and " + z + ":");
				for (int i = m; i <= z; i+=2) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("Even numbers between " + m + " and " + z + ":");
				for(int i = (m + 1); i<= z; i+=2) {
					System.out.println(i);
				}
			}
			
			System.out.println("Bye!");
		}
		
		int j = 0;
		
		while (j < 1) {
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			String ans = input.nextLine();
			
			if(ans.equals("Y")) {
				System.out.println("Enter a lower bound:");
				x = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter a upper bound:");
				z = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter a middle number:");
				m = input.nextInt();
				input.nextLine();
				
				if(x > z) {
					System.out.println("Error: lower bound " + x + " is not less than or equal to the upper bound " + z);
				}
				else if(x == z && z == m) {
					if((m % 2) == 0) {
						System.out.println("Odd numbers between " + x + " and " + m + ":");
						System.out.println("Even numbers between " + m + " and " + z + ":");
						System.out.println(x);
					}
					else {
						System.out.println("Odd numbers between " + x + " and " + m + ":");
						System.out.println(x);
						System.out.println("Even numbers between " + m + " and " + z + ":");
					}
				}
				else if(x < z && (m < x || m > z)) {
					System.out.println("Error: middle number " + m + " is not in-between te lower bound " + x + " and upper bound " + z);
				}
				else {
					if ((z % 2) == 1) {
						System.out.println("Odd numbers between " + x + " and " + m + ":");
						for(int i = z; i <= m; i+=2) {
							System.out.println(i);
						}
					}
					else {
						System.out.println("Odd numbers between " + x + " and " + m + ":");
						for(int i = (x + 1); i <= m; i+=2) {
							System.out.println(i);
						}
					}
					if((m % 2) == 0) {
						System.out.println("Even numbers between " + m + " and " + z + ":");
						for(int i = m; i <= z; i+=2) {
							System.out.println(i);
						}
					}
					else {
						System.out.println("Even numbers between " + x + " and " + m + ":");
						for(int i = (m+1); i <= z; i+=2) {
							System.out.println(i);
						}
					}
	
					}//
				}
				//
			
			else if(ans.contentEquals("N")){
				System.out.println("Bye!");
				j += 1;
			}
			else {
				System.out.println("Error: "+ ans + " is not valid ");
			}
		}
		
		input.close();
	}

}
