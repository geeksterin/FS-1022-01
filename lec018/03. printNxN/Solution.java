import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int r = 1; r <= n; r++){
           for(int c = 1; c <= n; c++){
               System.out.print("*");
           } 
            System.out.println();
        }
    }
}