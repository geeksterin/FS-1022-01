import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 4;
	    int r = 2;
	    
	    int nmr = n-r;
	    
	    // this is for n factorial
		int ansN = 1;
		for(int i = 1; i <= n; i++){
		    ansN = ansN * i;
		}
		
		// this is for r factorial
		int ansR = 1;
		for(int i = 1; i <= r; i++){
		    ansR = ansR * i;
		}
		
		// this is for nmr factorial
		int ansNMR = 1;
		for(int i = 1; i <= nmr; i++){
		    ansNMR = ansNMR * i;
		}
		
		int res = ansN / (ansNMR * ansR);
		
		System.out.print(res);
		
	}
}
