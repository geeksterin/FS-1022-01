import java.io.*;
import java.util.*;

public class Solution {
    //defining a function
    public static void solve(int  n){
        //logic here
        while(n > 0){
            int d = n % 10;
            System.out.println(d);
            //decompose
            n /= 10;
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        solve(n);
    }
}