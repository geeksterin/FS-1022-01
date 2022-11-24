import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        
        if(Character.isLowerCase(ch) == true){
            if(ch >= 'a' && ch <= 'w'){
                int ascii = ch;
                ascii = ascii + 3;
                ch = (char)ascii;
                System.out.println(ch);
            }
            else{
                System.out.println("Can't jump");
            }
        }
        else{
            System.out.println("Not a small case");
        }
    }
}