import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = 1;
        
        for(int i = 1 ; i <= n; i++){
            ans = ans * 2;
        }
        System.out.println(ans);
    }
}