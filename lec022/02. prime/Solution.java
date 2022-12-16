import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        // true means it is  prime
        return true;
    }
        
        
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i <= n; i++){
            int d = scn.nextInt();
            if(isPrime(d)){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}