import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int a = 0;
        int b = 1;
        
        for(int i = 1; i <= n; i++){
           System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}