import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        
        int a = x;
        int b = y;
        int c = z;
        
        y = a;
        z = b;
        x = c;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
    }
}