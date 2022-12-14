import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        
        x = x + y + z;
        y = x - y - z;
        z = x - y - z;
        x = x - y - z;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}