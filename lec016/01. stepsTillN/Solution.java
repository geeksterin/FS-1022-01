import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int count = 0;
        
        while(n > 0){
            if(n % 2 == 0){
                //even
                n -= 1;
            }
            else{
                //odd
                n -= 3;
            }
            count++;
        }
        System.out.println(count);
        
    }
}