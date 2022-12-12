import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int rows = 1; rows <= n; rows++){
            int spaces = n-rows;
            int stars = rows;
            
            for(int csp = 1; csp <= spaces; csp++){
                System.out.print(" ");
            }
            for(int cst = 1; cst <= stars; cst++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}