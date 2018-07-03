package takeScreenshots;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		   
        // Initialize a String that needs to be reversed
/*        String originalString = "SHAILAJA";

        // Empty String to store the reverse of the original string
String reverseString = "";

int length = originalString.length();

        // Started with the last position of a string till it reach to its 0 position
        for(int i=originalString.length()-1; i>=0;i--){

         // Original string is stored in the reverse order
           reverseString = reverseString+originalString.charAt(i);
}

        // To print the value of reversed string
System.out.println(reverseString);
 
}*/

	//Reverse the Given Array.
	int [] a = {1,2,3,4,5,6,7};
	int[] b = new int[a.length]; // same type as original array (int), same size (7)
	{
	  // array index starts from 0,
	  // so i should be initialized to array length - 1.
		int j = 0;

		for(int i = a.length-1; i >= 0; i--) {

		   b[j++] = a[i];

		}

	  System.out.println(Arrays.toString(b));

	 }

	}
	
	
	
}

