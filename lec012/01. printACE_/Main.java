import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // for(char ch = 'a' ; ch <= 'z'; ch = (char)(ch + 2)){
        //     System.out.println(ch);
        // }
        
        
        for(int i = 0; i < 26; i= i+2){
            System.out.println((char)('a'+ i));
        }
    }
}