import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        
        int c = x;
        System.out.println("c = " + c);
        x = y;
        System.out.println("x = " + x);
        y = c;
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}