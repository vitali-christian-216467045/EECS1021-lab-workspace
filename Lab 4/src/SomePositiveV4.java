
public class SomePositiveV4 {
	/*
	 * V1: scan the entire array (i.e., stay condition is i < ns.length),
	 * 		and with accumulation (i.e., somePos = somePos || n[i] > 0). works 
	 * V2: scan the entire (i.e., stay condition is i < ns.lenght),
	 * 		and without accumulation (i.e., somePos = ns[i[ > 0). does not work (depends on the last element)
	 * V3: may exit early (i.e., stay condition is i < ns.length && !somePos)
	 * 		and with accumulation (i.e., somePos = somePos && ns[i] > 0. works.
	 * V4: may exit early (i.e., stay condition is i < ns.length && somePos),
	 * 		and without accumulation (i.e., somePos = ns[i] > 0). works 
	 */
	public static void main(String[] args) {
		int[]  ns = {-2, -7, 4, 5, -1}; 
		boolean somePos = false;
		
		//early exit when possible
		for (int i = 0; i < ns.length && !somePos; i ++) {
			
			// no accumulation of result between iterations
			//as soon as somePos become true, the stay condition becomes false and exit from loop
			somePos = somePos || ns[i] > 0;
		}

	}

}