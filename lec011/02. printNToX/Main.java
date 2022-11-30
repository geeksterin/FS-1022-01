import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int x = scn.nextInt();
        
        for(int i = n; i >= x; i--){
            System.out.println(i);
        }
    }
}