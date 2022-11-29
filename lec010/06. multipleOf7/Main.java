import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // for(int i = 0; i <= n; i = i+7){
        //     System.out.print(i  + " ");
        // }
        
        for(int i = 0; i * 7 <= n; i++){
            System.out.print(i*7 + " ");
        }
        
    }
}