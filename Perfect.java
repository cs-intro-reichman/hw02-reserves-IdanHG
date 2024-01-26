/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]) ;
		int sum = 1; // sum of divisors
		String d = " = 1" ; //string of N divisors
		for (int i = 2 ; i < N ; i++) {
			if (N % i == 0) {
				sum += i;
				d += " + " + i;
			}
		}
		if (sum == N) {
			System.out.println(N + " is a perfect number since " + N + d);
		}
		else System.out.println(N + " is not a perfect number");
	}
}
