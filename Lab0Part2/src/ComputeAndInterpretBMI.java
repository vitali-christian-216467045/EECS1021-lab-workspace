import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String i = input.nextLine();
		
		System.out.println(i + " Enter your height in inches:");
		int h = input.nextInt();
		
		System.out.println(i + ", enter your weight in pounds:");
		int w = input.nextInt();
		input.nextLine();
		
		double convheight = h * 0.0254;
		double convweight = w * 0.45359237;
		
		double bmi = convweight / (convheight * convheight);
		System.out.println(i + ", your BMI is " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("You are underweight!");
		}
		else if (bmi >= 18.5 && bmi < 25.0) {
			System.out.println("You are normal!");
		}
		else if (bmi >= 25.0 && bmi < 30.0) {
			System.out.println("You are overweight");
		}
		else if(bmi >= 30.0) {
			System.out.println("You are obese!");
		}
		
		input.close();
	}

}
