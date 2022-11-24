import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);
        
        if(Character.isUpperCase(ch) == true){
            System.out.println("Capital case");
        }
        else if (Character.isLowerCase(ch)){
            System.out.println("Small case");
        }
        else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else{
            System.out.println("None");
        }
    }
}