import java.io.*;
import java.util.*;

public class Solution {
    public static int reverse(int n){
        int val = 0;
        while(n > 0){
            int d = n % 10;
            val = val * 10 + d;
            n /= 10;
        }
        return val;
    }
    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();          //123
        int ans = reverse(n);           //321
        System.out.println(ans);
    }
}