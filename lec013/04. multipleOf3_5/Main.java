import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                System.out.print(i + " ");
            }
        }
    }
}