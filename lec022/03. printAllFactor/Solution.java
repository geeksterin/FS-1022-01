import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isFactor(int n, int i){
        return n % i == 0;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i <= n; i++){
            if(isFactor(n,i)== true){
                System.out.println(i);
            }
        }
    }
}