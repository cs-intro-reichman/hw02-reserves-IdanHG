/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		double a = Math.random() * 10 ; 
		int a1 = (int) a ; //casts a to an integer
		System.out.print(a1 + " ");  
		int b = 0 ;
		while (a1 >= b) {
			b = a1 ;
			a =  Math.random() * 10 ;
			a1 = (int) a ;
			if (a1 >= b) System.out.print(a1 + " "); //prints integer only of greater than previous integer
		}

	}
}
