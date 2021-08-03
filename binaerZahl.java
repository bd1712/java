/**
 * 
 */
package a1;

public class binaerZahl {

	public static void print_to_zif(long z) {
		
		if (z < 2 )
			System.out.println(z);
		else {
			print_to_zif(z/2);
			System.out.println(z%2);
		}

	}

}
