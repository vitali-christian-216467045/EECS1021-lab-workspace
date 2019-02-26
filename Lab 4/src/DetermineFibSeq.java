import java.util.Arrays;
import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		boolean check = false;
		String choice;
		
		while (true) {
			int co = 0;
			int newnum[] = new int [20];
			for (int i = 0; i <= 19; i++) {
				System.out.println("Enter a positive integer value, or -1 to stop:");
				number = input.nextInt();
				input.nextLine();
				if (number == -1) {
					break;
				}
				else {
					newnum[i] = number;
				}
			}
			for (int i = 0; i<=19; i++) {
				if (newnum[i] != 0) {
				co++;
				}		
			}
			int fS[] = new int [co];
			for (int o = 0; o < co; o++) {
				if (newnum[o] != 0) {
					fS[o] = newnum[o];	
					}
			}
			for(int i = 2; i<=19;i++) {
				newnum[0] = 1;
				newnum[1] = 1;
				newnum[i] = newnum[i-1] + newnum[i-2];
			}
			if (co == 1) {
				if (fS[0] == 1) {
					check = true;
				}
			}
			
			else if(co == 2) {
				if (fS[0] == 1 && fS[1] ==1) {
					check = true;
				}
			}
			
			else {
				for(int i = 2; i<= (co - 1); i++) {
					if(fS[0] == 1 && fS[1] == 1) {
						if (fS[i] == newnum[i]) {
							check = true;
						}
						else {
							check = false;
							break;
						}
					}
					else {
						check = false;
					}
				}
			}
			if (check == true) {
				System.out.println("The sequence you entered " + Arrays.toString(fS) + " is the first " + co + " numbers in the Fibonacci sequence");
			}
			else if (check == false) {
				System.out.println("The sequence you entered " + Arrays.toString(fS) + " is not the first " + co + " numbers in the Fibonacci sequence");
			}
			System.out.println("Would you like to try another sequence? (Y/N)");
			choice = input.nextLine();
			if (choice.equals("N")) {
				System.out.println("Bye!");
				break;
			}
		}
		
		input.close();

	}

}