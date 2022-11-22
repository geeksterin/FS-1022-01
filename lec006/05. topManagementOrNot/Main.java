import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int exp = scn.nextInt();
        int sal = scn.nextInt();
        int rank = scn.nextInt();
        
        if( exp >= 10 || sal >= 50000 || rank >= 10 ){
            System.out.println("You are in top management");
        }
        else{
            System.out.println("You are not in top management");
        }
        
    }
}