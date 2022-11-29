import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 0; i <= n; i++ ){
            //Check if this 'i' is even or not
            
            if( i%2 == 0 ){
                System.out.println(i);
            }
        }
    }
}