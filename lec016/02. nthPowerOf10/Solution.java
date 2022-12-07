import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = 1;
        
        while(n > 0){
            n--;
            res = res * 10;
        }
        System.out.println(res);
    }
}