import java.util.Arrays;
import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int size = 1;
		String choise;
		
		while (true) {
			System.out.println("Enter the size of Fibonacci Sequence:");
			size = input.nextInt();
			input.nextLine();
			if (size <= 0) {
				System.out.println("Error: Fibonacci Sequence must have size >= 1.");
			}
			else if (size == 1) {
				System.out.println("Fibonacci Sequence of size 1:");
				System.out.println("<1>");
			}
			else if (size == 2) {
				System.out.println("Fibonacci Sequence of size 2:");
				System.out.println("<1,1>");
			}
			else if (size > 2) {
				int fS[] = new int [size];
				
				fS[0] = 1;
				fS[1] = 1;
				
				for (int i = 2; i <= (size - 1); i ++) {
					fS[i] = fS[i - 2] + fS[i - 1];
				}
				System.out.println("Fibonacci Sequence of size " + size + ":");
				System.out.println(Arrays.toString(fS));
			}
			System.out.println("Would you like to continue? (Y/N)");
			choise = input.nextLine();
			if (choise.equals("Y")) {
				size = 1;
			}
			else if (choise.equals("N")) {
				System.out.println("Bye!");
				break;
			}
			
		}
		
		input.close();

	}

}