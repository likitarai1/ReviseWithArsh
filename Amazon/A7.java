// A Java program to find first non-repeating character
// from a stream of characters
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class NonReapeatingC {
	final static int MAX_CHAR = 256;
	

	static void findFirstNonRepeating()
	{
	    String stream = "geeksforgeeksandgeeksquizfor";
		int[] alpha = new int[256];
		int n = stream.length();
		Arrays.fill(alpha, 0);
		ArrayList<Character> arr = new ArrayList<>();
		
		for(int i=0;i<n;i++){
		    alpha[stream.charAt(i) - 'a']++;
		    if(alpha[stream.charAt(i) - 'a'] <= 1){
		        arr.add(stream.charAt(i));
		    }
		    else{
		        arr.remove(stream.charAt(i));
		    }
		    
		    if(arr.isEmpty()){
		        System.out.print("#");
		    }
		    else{
		        System.out.print(arr.get(0));
		    }
		    
		}
		
	}

	/* Driver code */
	public static void main(String[] args)
	{
		findFirstNonRepeating();
	}
}
