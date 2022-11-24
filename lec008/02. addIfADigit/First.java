import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);
        
        if(Character.isDigit(ch)){
            int val = Character.getNumericValue(ch);
            val = val + 100;
            System.out.println(val);
        }else{
            System.out.println("This is not a digit");
        }
    }
}