import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st string:");
		String i = input.nextLine();
		
		System.out.println("Enter the 2nd string:");
		String j = input.nextLine();
		
		System.out.println("Enter the 3rd string:");
		String k = input.nextLine();
		
		System.out.println("Enter the 4th string:");
		String l = input.nextLine();
		
		System.out.println("Enter the 1st integer");
		int m = input.nextInt();
		
		System.out.println("Enter the 2nd integer");
		int n = input.nextInt();
		
		System.out.println("Enter the 3rd integer");
		int o = input.nextInt();
		
		System.out.println("Enter the 4th integer");
		int p = input.nextInt();
		
		
		System.out.println("Here are all the 16 possible combinations:");
		System.out.println("(" + i + "," + m + ")");
		System.out.println("(" + i + "," + n + ")");
		System.out.println("(" + i + "," + o + ")");
		System.out.println("(" + i + "," + p + ")");
		System.out.println("(" + j + "," + m + ")");
		System.out.println("(" + j + "," + n + ")");
		System.out.println("(" + j + "," + o + ")");
		System.out.println("(" + j + "," + p + ")");
		System.out.println("(" + k + "," + m + ")");
		System.out.println("(" + k + "," + n + ")");
		System.out.println("(" + k + "," + o + ")");
		System.out.println("(" + k + "," + p + ")");
		System.out.println("(" + l + "," + m + ")");
		System.out.println("(" + l + "," + n + ")");
		System.out.println("(" + l + "," + o + ")");
		System.out.println("(" + l + "," + p + ")");
		
		
		input.close();
	}

}
