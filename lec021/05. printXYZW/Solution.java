import java.io.*;
import java.util.*;

public class Solution {
   
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 0;
        for(int i = 1; i <= n; i++){
            int d = scn.nextInt();
            val = val * 10 + d;
        }
        System.out.println(val);
    }
}