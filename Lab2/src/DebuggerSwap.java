
public class DebuggerSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x is " + x);
		System.out.println("y is " + y);

	}

}
