import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        
        if( ch >= 'a' && ch <= 'z'){
            System.out.println("Small case");
        }
        else if( ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital case");
        }
        else if( ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("None");
        }
        
        
    }
}