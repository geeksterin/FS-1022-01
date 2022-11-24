import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);
        
        if(Character.isDigit(ch)){              // if(ch>='0' && ch <='9')
            int val = ch - '0';
            val = val + 100;
            System.out.println(val);
            
        }
        else{
            System.out.println("This is not a digit");
        }
        
    }
}