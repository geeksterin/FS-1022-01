import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        
        int i = 0;
        
        while(i < n){
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
            i++;
        }
        System.out.println(a);
        
    }
}