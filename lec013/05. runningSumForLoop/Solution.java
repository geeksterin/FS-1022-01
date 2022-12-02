import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            /*
            take ip
            maintain sum
            print sum
            */
            int val = scn.nextInt();
            sum = sum + val;
            System.out.println(sum);
            
        }
        
    }
}