/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]); //the output will be n's divisors
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { //if there is not remainder than i is a divisor of n.
				System.out.println(i); 
			}
		}
	}
}
