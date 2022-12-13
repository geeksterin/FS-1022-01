import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();      //sqaure
        
        for(int rows = 1; rows <= n; rows++){
            if(rows == n){
                for(int cst = 1 ; cst <= n; cst++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int csp = 1; csp <= n-2; csp++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}