
public class AllPositiveV4 {

	/*
	 * V1: scan the entire array (i.e., stay condition is i < ns.length),
	 * 		and with accumulation (i.e., allPos = allPos && n[i] > 0). works 
	 * V2: scan the entire (i.e., stay condition is i < ns.lenght),
	 * 		and without accumulation (i.e., allPos = ns[i[ > 0). does not work (depends on the last element)
	 * V3: may exit early (i.e., stay condition is i < ns.length && allPos)
	 * 		and with accumulation (i.e., allPos = allPos && ns[i] > 00. works.
	 * V4: may exit early (i.e., stay condition is i < ns.length && allPos),
	 * 		and without accumulation (i.e., allPos = ns[i] > 0). works 
	 */
	public static void main(String[] args) {
		int[]  ns = {2, 3, -1, 4, 5}; 
		boolean allPos = false;
		
		// early exit when possible 
		for (int i = 0; i < ns.length && allPos; i ++) {
			// no accumulation of result between iterations
			//as soon as allPos become false, the stay condition becomes false and exit from loop
			allPos = ns[i] > 0;

		}
	}

}