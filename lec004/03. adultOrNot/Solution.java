import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if(n >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Below age");
        }
    }
}
