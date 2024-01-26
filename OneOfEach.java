
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int b = 0 ; //counts number of boys
		int g = 0 ; //counts number of girls
		String family = "";
		while (b == 0 || g == 0){
			double s = Math.random() ;
			if ( s <= 0.5 ) {
				b++;
				family += "b "; 
			}
			else {
				g++;
				family += "g ";
			}
		}
		int numOFkids = b + g ; 
		System.out.println(family);
		System.out.println("You made it... and you now have " + numOFkids + " children.");

	}
}
