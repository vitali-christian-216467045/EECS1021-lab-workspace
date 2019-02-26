import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String choice = "Y";
		while(choice.equals("Y")) {
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1. Generate an arithmetic sequence");
			System.out.println("2. Generate a geometric sequence");
			System.out.println("3. Determine an arithmetic sequence");
		
			int taskn = input.nextInt();
			
			while(!(taskn > 0 && taskn < 4)) {
				System.out.println("Error: task number must be 1, 2, or 3.");
				System.out.println("What kind of processing task would you like to perform?");
				System.out.println("1. Generate an arithmetic sequence");
				System.out.println("2. Generate a geometric sequence");
				System.out.println("3. Determine an arithmetic sequence");
				
				taskn = input.nextInt();
			}
			
			if(taskn == 1) {//generate an arithmetic sequence
				System.out.println("Enter the first term in the arithmetic sequence: ");
				int n1 = input.nextInt();
				System.out.println("Enter the common difference in the arithmetic sequence: ");
				int d = input.nextInt();
				System.out.println("Enter the number of terms in the arithmetic sequence: ");
				int l = input.nextInt();
				int[] arith = new int[l];//stores arithmetic series
				
				int sum = 0;
				System.out.print("<");
				//formula = firstNumber + index * 2
				for(int i = 0; i < arith.length; i++) {
					arith[i] = n1 + (i*d);
					sum+= n1 + (i*d);
					if(i == arith.length-1) {
						System.out.print(arith[i]);
					}else {
						System.out.print(arith[i] +", ");
					}
				}
				System.out.println(">");
				System.out.println("Sum of the arithmetic sequence: " + sum);
				input.nextLine();//goes to new line

			}else if(taskn == 2) {//generate geometric sequence
				System.out.println("Enter the first term in the geometric sequence: ");
				int n1 = input.nextInt();
				System.out.println("Enter the common ratio in the geometric sequence: ");
				int r = input.nextInt();
				System.out.println("Enter the number of terms in the geometric sequence: ");
				int l = input.nextInt();
				int[] geo = new int[l];//stores geometric series
				
				int sum = 0;
				System.out.print("<");
				//formula = firstNumber * ratio^index
				for(int i = 0; i < geo.length; i++) {
					geo[i] = n1 * (int)(Math.pow(r, i));
					sum+= n1 * (int) (Math.pow(r, i));
					if(i == geo.length-1) {
						System.out.print(geo[i]);
					}else {
						System.out.print(geo[i] +", ");
					}
				}
				System.out.println(">");
				System.out.println("Sum of the geometric sequence: " + sum);				
				input.nextLine();//goes to new line

			}else if(taskn == 3) {//determine an arithmetic sequence
				
				int[] temp = new int[10];
				
				int counter = 0;
				String cont = "Y";
				//stores the entered numbers into the array
				while(cont.equals("Y") && counter < temp.length) {
					System.out.println("Enter a new number: ");
					int num = input.nextInt();
					temp[counter] = num;
					
					
					if(counter == 9) {
						System.out.println("You have entered maximum numbers of numbers!");
						input.nextLine();
					}else {
						System.out.println("You have entered " + (counter+1) + " numbers.");
						System.out.println("You may still enter another " + (temp.length-counter-1) + " numbers");
					
						System.out.println("Would you like to enter another number?(Y/N)");
						input.nextLine();//goes to new line
						cont = input.nextLine();
					}
					
					if(cont.equals("N") && counter < 1) {
						System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
					}
					
					counter++;
				}
				//array swap from temp to arith
				int[] arith = new int[counter];
				for(int i = 0; i < counter; i++) {
					arith[i] = temp[i];
				}
				
				if(!(counter < 2)) {//continues if there are more than 1 numbers in the sequence
					boolean isArith = true;
					int sum = 0;
					System.out.println("We will start processing your sequence right away.");
					
					//checks if its arithmetic sequence or not
					for(int i = arith.length-2; i > 0; i--) {
						isArith = arith[i+1]-arith[i] == arith[i] - arith[i-1];						
					}
					
					//outputs the information
					System.out.print("<");
					for(int i = 0; i < arith.length; i++) {
						if(i==arith.length-1) {
							System.out.print(arith[i]);
						}else {
							System.out.print(arith[i] + ", ");
						}
						sum += arith[i];						
					}
					if(isArith) {
						int d = arith[arith.length-1] - arith[arith.length-2];
						System.out.println("> is an arithmetic sequence with");
						System.out.println("first term " + arith[0] + ", common difference " + 
							d + ", length " + arith.length + ", and sum " + sum);
					}else {
						System.out.println("> is not an arithmetic sequence");
					}
				}
			}
			
			
			System.out.println("Would you like to process another sequence?(Y/N)");
			choice = input.nextLine();
			
		
		}
		
		System.out.println("Bye!");
		
		input.close();
	}

}
