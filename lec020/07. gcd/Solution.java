import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        
        int gcd = 1;
        
        if(y > x){
            int temp = x;
            x = y;
            y = temp;
        }
        
        //Conclude: X is always greater than Y
        
        for(int i = 2; i <= y; i++){
            if(x % i == 0 && y % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        
    }
}