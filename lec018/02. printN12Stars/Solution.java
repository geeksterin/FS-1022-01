import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int rows = 12;
        int cols = n;
        
        for(int r = 1; r <= rows; r++){
            //do your task for each row
            
            for(int c = 1; c <= cols; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}