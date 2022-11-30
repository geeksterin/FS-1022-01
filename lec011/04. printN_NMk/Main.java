import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        // for(int i = n; i >= 0; i= i-k){
        //     System.out.println(i);
        // }
        
        for(int i = 0;  n - (i*k) >= 0  ; i++){
            System.out.println(n - (i*k));
        }
    }
}