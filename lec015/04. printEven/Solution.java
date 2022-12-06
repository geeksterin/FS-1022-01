import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int x = 0;
        // while(x <= n){
        //     if(x%2 == 0){
        //         System.out.println(x);
        //     }
        //     x++;
        // }
        
        while(x <= n){
            System.out.println(x);
            x += 2;
        }
        
        
        
    }
}