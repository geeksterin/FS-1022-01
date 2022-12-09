import java.util.*;
public class Main
{
    
    public static int factorial(int M){
        int res = 1;
		for(int i = 1; i <= M; i++){
		    res = res * i;
		}
        return res;
    }
    
    
	public static void main(String[] args) {
        int n = 4;
        int r = 2;
        int nmr = n-r;
        
		int ansN = factorial(n);
		int ansR = factorial(r);
		int ansNMR = factorial(nmr);
		
		int ans = ansN / (ansR * ansNMR);
		System.out.println(ans);
	}
}
