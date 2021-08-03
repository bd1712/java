/**
 * 
 */
package a1;


public class CharRecursion {

	
	public static void printName(String name, int index)
	  {
	    if(index > name.length() - 1)
	    {
	        return;
	    }
	    else
	    {
	        System.out.println(name.charAt(index));
	        printName(name, index + 1);
	        System.out.println(name.charAt(index));
	    }
	  }
	public static void main(String[] args) 
	  {
	        printName("Brian", 0);
	  }

	}

