import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        
        if( x >= 20 && z < 100 ){
            z += 200;
        }
        else if( x >= 10 || y < 50){
            z += 100;
        }
        
        System.out.println(z);
    }
}