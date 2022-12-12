import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int r = 1; r <= n; r++){
            int val = 5;
            for(int c = 1; c <= r; c++){
                System.out.print(val + " ");
                val += 5;
            }
            System.out.println();
        }
        
    }
}