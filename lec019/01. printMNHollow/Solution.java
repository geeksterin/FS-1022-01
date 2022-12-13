import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();      //cols
        int n = scn.nextInt();      //rows
        
        for(int rows = 1; rows <= n; rows++){
            if(rows == 1  || rows == n){
                for(int cst = 1 ; cst <= m; cst++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int csp = 1; csp <= m-2; csp++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}