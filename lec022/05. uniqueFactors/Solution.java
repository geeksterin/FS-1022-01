import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();      
        
        int divisor = 2;
        while(n > 1){
            if(n % divisor == 0){
                System.out.println(divisor);
                while(n % divisor == 0){
                    n /= divisor;
                }
            }
            divisor++;
        }
        
        
        
    }
}