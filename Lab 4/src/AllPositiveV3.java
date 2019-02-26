
public class AllPositiveV3 {

	public static void main(String[] args) {
		int[]  ns = {2, 3, -1, 4, 5}; 
		boolean allPos = false;
		
		// early exit when possible 
		for (int i = 0; i < ns.length && allPos; i ++) {
			// accumulation of result between iterations
			allPos = ns[i] > 0;
		}
		System.out.println("All element in array is postive: " + allPos);

	}

}