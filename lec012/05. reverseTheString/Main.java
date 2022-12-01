import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}