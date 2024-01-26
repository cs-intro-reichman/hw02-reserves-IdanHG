import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		int f2 = 0; //counts num of families with 2 children
		int f3 = 0; //counts num of families with 3 children
		int f4 = 0; //counts num of families with 4+ children
		double avg; //will be the average of children per family
		int totalChildren = 0; // count num of total kids
		for (int i = 1; i <= T; i++) {
			int b = 0 ; //counts number of boys
			int g = 0 ; //counts number of girls
			while (b == 0 || g == 0) {
				double s = generator.nextDouble() ;
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
		System.out.println("Average: " + avg + " chldren to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + f2);
		System.out.println("Number of families with 3 children: " + f3);
		System.out.println("Number of families with 4 or more children: " + f4);

		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
