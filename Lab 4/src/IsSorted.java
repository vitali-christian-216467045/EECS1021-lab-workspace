
public class IsSorted {
	//we solve this problem by applying what we learned from AllPositive4
	
	public static void main(String[] args) {
		
		int[] ns = {2, 4, 3, 3};
		boolean isSorted = true;
		for (int i = 0; isSorted && i < ns.length - 1; i ++) {
			isSorted = ns[i] <= ns [i + 1];
		}
		System.out.print("Array is sorted: " + isSorted);

	}

}
