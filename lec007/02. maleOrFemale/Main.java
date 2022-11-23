import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);
        
        if( ch == 'M' || ch == 'm' ){
            System.out.println("You are a male");
        }
        else if( ch == 'F' || ch == 'f' ){
            System.out.println("You are a female");
        }
        else{
            System.out.println("Type again");
        }
        
    }
}