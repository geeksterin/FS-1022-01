import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        //init cond
        int stars = 1;
        int spaces = n-1;
        
        for(int rows = 1; rows <= n; rows++){
            //spaces
            for(int csp = 1 ; csp <= spaces; csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst = 1; cst <= stars; cst++){
                System.out.print("* ");
            }
            stars++;
            spaces--;
            System.out.println();
            
        }
    }
}