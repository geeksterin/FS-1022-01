import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int firstPart = n / 1000;
        int secondPart = n % 1000;
        
        int ans = secondPart * 10000 + firstPart;
        System.out.println(ans);
        
        
    }
}