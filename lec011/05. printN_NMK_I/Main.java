import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        int I = scn.nextInt();
        
        for(int i = n; i >= I; i -= k){
            System.out.println(i);
        }
        
    }
}