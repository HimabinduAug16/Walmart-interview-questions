package strings;

public class WalmartToLawmtra {

	public static void main(String[] args) {
		
		
		String str = "WALMART";
		//            0123456
		
		char [] chr = str.toCharArray(); 
		/*converts this string to a new character array and initialized 
		 * to contain the character sequence represented by this string.
		 *
		 */
		// swapping method using temporary variable
		char temp = chr[0];
		chr[0] = chr[2];
		chr[2] = temp;
		char temp1 = chr[4];
		chr[4] = chr[6];
		chr[6] = temp1;
		
		String str1 = new String(chr);
		
	     System.out.println("Original String is "  +str);
	    System.out.println("Reverse string is " +str1);
		

	}

}
