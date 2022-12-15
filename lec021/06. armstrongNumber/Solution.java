import java.io.*;
import java.util.*;

public class Solution {
    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            count++;
            n /= 10;
        }  
        return count;
    }
    
    public static int power(int x, int y){
        int val = 1;
        for(int i = 1; i <= y; i++){
            val *= x;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int totalDigit = countDigit(n);
        int num = 0;
        
        while(n > 0){
            int d = n % 10;
            num += power(d,totalDigit );
            n /= 10;
        }
        System.out.println(temp == num );
        
    }
}