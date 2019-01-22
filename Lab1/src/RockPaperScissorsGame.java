import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int player1count = 0;
		int player2count = 0;
		String player1,p1let,player2,p2let,r,p,s;
		
		r = "R";
		p = "P";
		s = "S";
		
		System.out.println("Enter the name of player 1:");
		player1 = input.nextLine();
		System.out.println("Enter the name of player 2:");
		player2 = input.nextLine();
		
		System.out.println("============");
		System.out.println("Round 1:");
		System.out.println("============");
		
		System.out.println("What does " + player1 + " play? (R, P, or S)");
		p1let = input.nextLine();
		p1let = p1let.toUpperCase();
		
		System.out.println("What does " + player2 + " play? (R, P, or S)");
		p2let = input.nextLine();
		p2let = p2let.toUpperCase();
		
		if(p1let.equals("R") && p2let.contentEquals("S")) {player1count = player1count + 1;}
		else if(p1let.equals("S") && p2let.contentEquals ("P")) {player1count = player1count +1;}
		else if(p1let.equals("P") && p2let.contentEquals ("R")) {player1count = player1count +1;}
		else if(p1let.equals(p2let)) {}
		else {player2count = player2count + 1;}
		
		System.out.println("============");
		System.out.println("Round 2:");
		System.out.println("============");
		
		System.out.println("What does " + player1 + " play? (R, P, or S)");
		p1let = input.nextLine();
		p1let = p1let.toUpperCase();
		
		System.out.println("What does " + player2 + " play? (R, P, or S)");
		p2let = input.nextLine();
		p2let = p2let.toUpperCase();
		
		if(p1let.equals("R") && p2let.contentEquals("S")) {player1count = player1count + 1;}
		else if(p1let.equals("S") && p2let.contentEquals ("P")) {player1count = player1count +1;}
		else if(p1let.equals("P") && p2let.contentEquals ("R")) {player1count = player1count +1;}
		else if(p1let.equals(p2let)) {}
		else {player2count = player2count + 1;}
		
		if(player1count>player2count +1) {System.out.println("Game over: " + player1 + " wins!");}
		else if(player2count>player1count + 1) {System.out.println("Game Over: " + player2 + " wins!");}
		else {
			System.out.println("============");
			System.out.println("Round 3:");
			System.out.println("============");
			
			System.out.println("What does " + player1 + " play? (R, P, or S)");
			p1let = input.nextLine();
			p1let = p1let.toUpperCase();
			
			System.out.println("What does " + player2 + " play? (R, P, or S)");
			p2let = input.nextLine();
			p2let = p2let.toUpperCase();
			
			if(p1let.equals("R") && p2let.contentEquals("S")) {player1count = player1count + 1;}
			else if(p1let.equals("S") && p2let.contentEquals ("P")) {player1count = player1count +1;}
			else if(p1let.equals("P") && p2let.contentEquals ("R")) {player1count = player1count +1;}
			else if(p1let.equals(p2let)) {}
			else {player2count = player2count + 1;}
			
			if(player1count>player2count +1) {System.out.println("Game over: " + player1 + " wins!");}
			else if(player2count>player1count + 1) {System.out.println("Game Over: " + player2 + " wins!");}
			else {System.out.println("Game over: a tie between " + player1 + " and " + player2);}
			
		}
		
		
		input.close();
	}

}
