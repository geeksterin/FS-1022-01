import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int i = 1;
        
        int max = -100;
        int steps = 0;
        
        
        while(i <= n){
            int val = scn.nextInt();
            if(val > max){
                max = val;
                steps++;
            }
            i++;
        }
        System.out.println(steps);
    }
}