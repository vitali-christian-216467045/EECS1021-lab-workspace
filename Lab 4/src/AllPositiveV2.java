public class AllPositiveV2 {

	public static void main(String[] args) {
		int[]  ns = {2, 3, -1, 4, 9}; //{2, 3, -2, 4, 5};
		boolean allPos = false;
		for (int i = 0; i < ns.length; i ++) {
			/* this is wrong without the accumulation */
			allPos = ns[i] > 0;
		}
		System.out.println("All element in array is postive: " + allPos);

	}

}