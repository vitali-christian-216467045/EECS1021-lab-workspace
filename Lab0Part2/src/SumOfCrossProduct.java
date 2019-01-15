import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st integer in sequence 1:");
		int i = input.nextInt();
		
		System.out.println("Enter the 2nd integer in sequence 1:");
		int j = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 1:");
		int k = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 1:");
		int l = input.nextInt();
		
		System.out.println("Enter the 1st integer in sequence 2:");
		int m = input.nextInt();
		
		System.out.println("Enter the 2nd integer in sequence 2:");
		int n = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 2:");
		int o = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 2:");
		int p = input.nextInt();
		
		System.out.println("sum([" + i + ", " + j + ", " + k + ", " + l + "]" + " * " + "[(" + m + ", " + n + ", " + o + ", " + p + ")]" + " = " + ((i * m) + (j * n) + (k * o) + (l * p)));
		
		input.close();
	}

}
