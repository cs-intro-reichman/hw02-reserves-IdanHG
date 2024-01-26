/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args) {
		String str = args[0] ;
		String rev = "" ;
		char mid = str.charAt((str.length() -1) / 2) ;
		for (int i = 0 ; i <= (str.length() -1)  ; i++ ) {
			char c = str.charAt(str.length() - 1 -i);
			rev += c ;
		}
		System.out.println(rev);
		System.out.println("The middle character is " + mid);

	}
}
