import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double ic,p1,p2,p3,pay;
		int fs;
		String name;
		
		System.out.println("Enter your name: ");
		name = input.nextLine();
		
		System.out.println(name + ", enter your filing satus (1 - Single Filing; 2 - Married Filing):");
		fs = input.nextInt();
		
		if(fs==1) {
			System.out.println(name + ", enter your taxable income.");
			ic = input.nextDouble();
			
			if(ic>33950) {
				p1 = 835;
				p2 = 3840;
				p3 = (ic-33950)*0.25;
				pay = p1 + p2 + p3;
					
				System.out.println(name + ", you should pay $" + pay);
				System.out.println("Calculation is based on the scheme of Single Filing.");
				System.out.println("Part I: $" + p1);
				System.out.println("Part II: $" + p2);
				System.out.println("Part III: $" + p3);
			}
			else if(ic>8350 && ic<=33950)
		{
				p1 = 835;
				p2 = (ic-8350)*0.15;
				
				pay = p1+p2;
		}
				
		
		}
		
		
		input.close();
	}

}
