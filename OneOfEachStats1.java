/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int f2 = 0; //counts num of families with 2 children
		int f3 = 0; //counts num of families with 3 children
		int f4 = 0; //counts num of families with 4+ children
		double avg; //will be the average of children per family
		int totalChildren = 0; // count num of total kids
		for (int i = 1; i <= T; i++) {
			int b = 0 ; //counts number of boys
			int g = 0 ; //counts number of girls
			while (b == 0 || g == 0) {
				double s = Math.random() ;
				if ( s <= 0.5 ) {
					b++ ;
				}
				else {
					g++ ;
				}
			}
			int famKids = b + g ; //count num of kids in 1 family 
			if (famKids == 2) f2++ ;
			else if (famKids == 3) f3++ ;
			else f4++ ;
			totalChildren += famKids ;
		}
		avg = (double) totalChildren / T ; 

		System.out.println("Average: " + avg + " chlidren to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + f2);
		System.out.println("Number of families with 3 children: " + f3);
		System.out.println("Number of families with 4 or more children: " + f4);
		 
		if (Math.max(f2, Math.max(f3,f4)) == f2) System.out.println("The most common number of children is 2.");
		else if (Math.max(f2, Math.max(f3,f4)) == f3) System.out.println("The most common number of children is 3.");
		else System.out.println("The most common number of children is 4 or more.");
		
	}
}
